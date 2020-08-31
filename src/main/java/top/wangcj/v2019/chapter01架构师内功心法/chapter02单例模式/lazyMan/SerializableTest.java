package top.wangcj.v2019.chapter01架构师内功心法.chapter02单例模式.lazyMan;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化单例测试类
 * @author wangchaojie
 * @description
 * @date 2019/8/17 16:43
 */
public class SerializableTest {

    public static void main(String[] args) {
        SerializableLazyMan s1;
        SerializableLazyMan s2 = SerializableLazyMan.getInstance();
        FileOutputStream fileOutputStream;
        try {
            //将s2写入序列化中
            fileOutputStream = new FileOutputStream("1.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();
            //将对象反序列化赋给s1
            FileInputStream fileInputStream = new FileInputStream("1.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            s1 = (SerializableLazyMan) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(s1);
            System.out.println(s2);
            //比较两个对象是否为同一对象
            System.out.println(s1 == s2);
        } catch (Exception e) {

        }
    }
}
