package top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter03抽象工厂;

import top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter01设计模式总览及工厂模式.chapter03抽象工厂.INote;
import top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter01设计模式总览及工厂模式.chapter03抽象工厂.IVideo;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/2 9:49
 **/
public interface ICourseFactory {
    IVideo getVideo();

    INote getNote();
}
