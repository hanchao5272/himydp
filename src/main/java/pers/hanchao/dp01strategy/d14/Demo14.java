package pers.hanchao.dp01strategy.d14;

/**
 * <p>测试 实现多个接口的方式</p>
 *
 * @author hanchao 2018/4/28 22:06
 **/
public class Demo14 {
    /**
     * <p></p>
     *
     * @author hanchao 2018/4/28 22:06
     **/
    public static void main(String[] args) {
        /**
         * 0 绿头鸭
         * 1 红头鸭
         * 2 橡皮鸭
         * 3 诱饵鸭
         */
        int type = 2;
        switch (type) {
            case 0:
                //绿头鸭
                MallardDuck14 duck0 = new MallardDuck14("汤姆");
                duck0.display();
                duck0.quack();
                duck0.swim();
                duck0.fly();
                break;
            case 1:
                //红头鸭
                RedheadDuck14 duck1 = new RedheadDuck14("杰瑞");
                duck1.display();
                duck1.quack();
                duck1.swim();
                duck1.fly();
                break;
            case 2:
                //橡皮鸭
                RubberDuck14 duck2 = new RubberDuck14("托尼");
                duck2.display();
                duck2.quack();
                duck2.swim();
                break;
            case 3:
                //诱饵鸭
                DecoyDuck14 duck3 = new DecoyDuck14("索尔");
                duck3.display();
                duck3.swim();
                break;
            default:
                break;
        }
    }
}
