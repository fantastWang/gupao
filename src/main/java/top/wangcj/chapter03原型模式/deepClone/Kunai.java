package top.wangcj.chapter03原型模式.deepClone;

import java.io.Serializable;

/**
 * 忍具:苦无
 * Created by Tom.
 */
public class Kunai implements Serializable {
    public float h = 100;
    public float d = 10;

    //放大
    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    //缩小
    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
