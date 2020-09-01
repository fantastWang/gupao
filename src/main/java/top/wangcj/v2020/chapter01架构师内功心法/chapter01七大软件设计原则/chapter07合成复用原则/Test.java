package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter07合成复用原则;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 10:00
 **/
public class Test {
    public static void main(String[] args) {
        Product product = new Product(new MySqlConnection());
        product.getConnection();
    }
}
