package top.wangcj.v2019.chapter01架构师内功心法.chapter03原型模式.deepClone;

import java.io.*;
import java.util.Date;

/**
 * 漩涡鸣人
 * Created by Tom.
 */
public class UzumakiNaruto extends Ninja implements Cloneable, Serializable {

    public Kunai kunai;

    public UzumakiNaruto() {
        this.birthday = new Date();
        this.kunai = new Kunai();
    }

    /**
     * 这里采用深克隆，可能会出现单例被破坏的情况，所以原型模式和单例模式有点互斥的
     *
     * @return
     */
    @Override
    protected Object clone() {
        return this.deepClone();
    }

    /**
     * 字节码拷贝
     */
    public Object deepClone() {
        try {
            //内存中完成对象的读写操作，而且是通过字节码直接操作的，与序列化操作类似
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            //完整的新的对象，由readObject源码可知，是通过构造器new出来的
            UzumakiNaruto copy = (UzumakiNaruto) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 浅克隆
     */
    public UzumakiNaruto shallowClone(UzumakiNaruto target) {
        UzumakiNaruto uzumakiNaruto = new UzumakiNaruto();
        uzumakiNaruto.height = target.height;
        uzumakiNaruto.weight = target.height;
        uzumakiNaruto.kunai = target.kunai;
        uzumakiNaruto.birthday = new Date();
        return uzumakiNaruto;
    }
}