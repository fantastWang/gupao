package top.wangcj.v2019.chapter01架构师内功心法.chapter05委派模式.generalDelegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 主厨：接受Boss的命令，去向对应的厨师分发要求
 */
public class Chef {
    /**
     * 用于存储每名厨师的特长，相当于厨师的简历
     **/
    private static Map<String, Cook> cooker = new HashMap<>();

    public Chef() {
        //记录每个厨师擅长的菜系
        cooker.put("徽菜", new AnhuiCuisine());
        cooker.put("粤菜", new GudongCuisine());
        cooker.put("湘菜", new HunanCuisine());
    }

    /**
     * 去执行Boss的请求，调用对应的厨师去做菜
     *
     * @param command
     */
    public void command(String command) {
        cooker.get(command).cook(command);
    }
}
