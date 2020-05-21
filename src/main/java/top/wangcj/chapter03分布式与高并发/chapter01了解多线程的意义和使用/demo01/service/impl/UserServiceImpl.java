package top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01.service.impl;

import org.springframework.stereotype.Service;
import top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01.entity.User;
import top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01.mapper.UserMapper;
import top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo01.service.UserService;

import javax.annotation.Resource;

/**
 * @author wangchaojie
 * @Description 具体实现
 * @Date 2020/5/21 19:50
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
