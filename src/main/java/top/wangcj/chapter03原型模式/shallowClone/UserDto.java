package top.wangcj.chapter03原型模式.shallowClone;

/**
 * 原对象
 * @author wangchaojie
 * @description
 * @date 2019/8/22 10:51
 */
public class UserDto implements Prototype{

    private int age;
    private String name;
    private String mobile;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public Prototype clone() {
        UserDto dto = new UserDto();
        dto.setAge(this.age);
        dto.setName(this.name);
        dto.setMobile(this.mobile);
        return dto;
    }
}
