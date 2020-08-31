package top.wangcj.v2019.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/5/21 20:00
 **/
//开启mapper文件扫描，需要映射到mapper的包下
@MapperScan("top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01.mapper")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
