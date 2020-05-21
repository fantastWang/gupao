package top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01.entity.User;
import top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01.service.UserService;

/**
 * @author wangchaojie
 * @Description 用户controller
 * @Date 2020/5/21 19:50
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @Author wangchaojie
     * @Description 模拟注册用户，并发送验证码场景，使用线程/非线程的方式，得到不同的耗时
     * @Date 20:22 2020/5/21
     **/
    @PostMapping("/add")
    public String add(User user) {
        //除了第一次初次连接数据库较慢外，其他执行都很快，如果执行发送短信接口，操作多一步，耗时会更慢，就可以用异步线程执行，那么会对当前资源的耗时会更少
        long startTime = System.currentTimeMillis();
        userService.addUser(user);
        long endTime = System.currentTimeMillis();
        return "耗时：" + (endTime - startTime);
    }
}
