package top.wangcj.chapter03原型模式.shallowClone;

/**
 * @author wangchaojie
 * @description 浅克隆测试类
 * @date 2019/8/22 11:05
 */
public class ShallowCloneTest {
    public static void main(String[] args) {
        //原对象
        UserDto userDto = new UserDto();
        userDto.setAge(18);
        userDto.setName("Jack");
        userDto.setMobile("18010913348");
        //克隆对象
        UserVo vo = new UserVo();
        UserDto prototype = (UserDto) vo.startClone(userDto);
        System.out.println("原对象引用类型地址的值：" + userDto.getMobile());
        System.out.println("克隆后对象引用类型地址的值：" + prototype.getMobile());
        System.out.println("对象引用类型地址是否一致：" + (userDto.getMobile() == prototype.getMobile()));
        System.out.println("对象是否一致：" + (userDto == prototype));
    }
}