package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter04容器式单例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
    public static void main(String[] args) {
        try {
            SerializeSingleton h1;
            SerializeSingleton h2 = SerializeSingleton.getInstance();
            //序列化 将h2对象写入序列化 只有实现Serializable接口的才可以进行序列化操作
            FileOutputStream f1 = new FileOutputStream("fileOutPutStream.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(f1);
            outputStream.writeObject(h2);
            outputStream.flush();
            outputStream.close();
            //反序列化
            FileInputStream f2 = new FileInputStream("fileOutPutStream.txt");
            ObjectInputStream inputStream = new ObjectInputStream(f2);
            h1 = (SerializeSingleton) inputStream.readObject();
            inputStream.close();
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h1 == h2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
