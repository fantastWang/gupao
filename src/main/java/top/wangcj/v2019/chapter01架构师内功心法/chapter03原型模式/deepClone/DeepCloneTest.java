package top.wangcj.v2019.chapter01架构师内功心法.chapter03原型模式.deepClone;

public class DeepCloneTest {

    public static void main(String[] args) {
        UzumakiNaruto uzumakiNaruto = new UzumakiNaruto();
        try {
            UzumakiNaruto clone = (UzumakiNaruto) uzumakiNaruto.clone();
            System.out.println("测试深克隆：" + (uzumakiNaruto.kunai == clone.kunai));
        } catch (Exception e) {
            e.printStackTrace();
        }

        UzumakiNaruto q = new UzumakiNaruto();
        UzumakiNaruto n = q.shallowClone(q);
        System.out.println("测试浅克隆：" + (q.kunai == n.kunai));
    }
}
