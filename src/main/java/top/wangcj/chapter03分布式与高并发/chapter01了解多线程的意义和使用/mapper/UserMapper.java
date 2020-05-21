package top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.mapper;

import top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.entity.User;

/**
 * @author wangchaojie
 * @Description mapper接口对象
 * @Date 2020/5/21 19:50
 **/
public interface UserMapper {

    void addUser(User user);
}
