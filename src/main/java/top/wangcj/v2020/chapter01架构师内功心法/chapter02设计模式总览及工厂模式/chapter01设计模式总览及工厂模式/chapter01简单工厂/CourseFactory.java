package top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter01设计模式总览及工厂模式.chapter01简单工厂;

import org.springframework.util.StringUtils;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 14:49
 **/
public class CourseFactory {
    public ICourse createCourse(Class<? extends ICourse> clz) {
        if(!StringUtils.isEmpty(clz)){
            try {
                return clz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
