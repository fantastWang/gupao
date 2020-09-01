package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter07合成复用原则;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 9:59
 **/
public class Product {

    private DBConnection dbConnection;

    public Product(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void getConnection(){
        this.dbConnection.getConnection();
    }
}
