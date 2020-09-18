package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter02建造者模式.easy;

import lombok.Data;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/8 15:41
 **/
@Data
public class Course {
    private String video;
    private String note;
    private String name;

    @Override
    public String toString() {
        return "Course{" +
                "video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
