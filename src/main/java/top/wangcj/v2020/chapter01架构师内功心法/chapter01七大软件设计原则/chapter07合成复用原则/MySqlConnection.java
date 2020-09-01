package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter07合成复用原则;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 9:58
 **/
public class MySqlConnection implements DBConnection {
    @Override
    public void getConnection() {
        System.out.println("MySQL连接");
    }
}
