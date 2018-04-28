package pers.hanchao.dp01strategy.d01;

/**
 * <p>测试方法</p>
 *
 * @author hanchao 2018/4/28 0:12
 **/
public class Demo01 {
    /**
     * <p></p>
     *
     * @author hanchao 2018/4/28 0:10
     **/
    public static void main(String[] args) {
        Duck01 duck = new MallardDuck01("");;
        /**
         * 0 绿头鸭
         * 1 红头鸭
         * 2 橡皮鸭
         * 3 诱饵鸭
         */
        int type = 3;
        switch (type) {
            case 0:
                //绿头鸭
                duck = new MallardDuck01("汤姆");
                break;
            case 1:
                //红头鸭
                duck = new RedheadDuck01("杰瑞");
                break;
            case 2:
                //橡皮鸭
                duck = new RubberDuck01("托尼");
                break;
            case 3:
                //诱饵鸭
                duck = new DecoyDuck01("索尔");
                break;
            default:
                break;
        }
        duck.display();
        duck.quack();
        duck.swim();
        duck.fly();
    }
}
