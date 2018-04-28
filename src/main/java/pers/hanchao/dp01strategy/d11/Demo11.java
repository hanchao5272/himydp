package pers.hanchao.dp01strategy.d11;

/**
 * <p>测试方法</p>
 *
 * @author hanchao 2018/4/28 0:12
 **/
public class Demo11 {
    /**
     * <p></p>
     *
     * @author hanchao 2018/4/28 0:10
     **/
    public static void main(String[] args) {
        Duck11 duck = new MallardDuck11("");;
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
                duck = new MallardDuck11("汤姆");
                break;
            case 1:
                //红头鸭
                duck = new RedheadDuck11("杰瑞");
                break;
            case 2:
                //橡皮鸭
                duck = new RubberDuck11("托尼");
                break;
            case 3:
                //诱饵鸭
                duck = new DecoyDuck11("索尔");
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
