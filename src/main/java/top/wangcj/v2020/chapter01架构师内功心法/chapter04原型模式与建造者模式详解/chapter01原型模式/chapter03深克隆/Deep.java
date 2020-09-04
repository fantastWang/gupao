package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式.chapter03深克隆;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @author wangchaojie
 * @Description 深克隆-序列化形式克隆
 * @Date 2020/9/4 10:56
 **/
@Data
public class Deep implements Cloneable, Serializable {
    private List<String> list;
    public Deep deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Deep) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
