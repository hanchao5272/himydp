package pers.hanchao.dp01strategy.d15;

import pers.hanchao.dp01strategy.d15.strategy.fly.impl.FlyWithRocket;

/**
 * <p>测试：策略模式</p>
 *
 * @author hanchao 2018/4/28 22:52
 **/
public class Demo15 {
    /**
     * <p></p>
     *
     * @author hanchao 2018/4/28 22:52
     **/
    public static void main(String[] args) {
        Duck15 duck = new MallardDuck15("");
        ;
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
                duck = new MallardDuck15("汤姆");
                break;
            case 1:
                //红头鸭
                duck = new RedheadDuck15("杰瑞");
                break;
            case 2:
                //橡皮鸭
                duck = new RubberDuck15("托尼");
                break;
            case 3:
                //诱饵鸭
                duck = new DecoyDuck15("索尔");
                break;
            default:
                break;
        }
        duck.display();
        duck.swim();
        System.out.print(duck.getName());
        duck.performQuack();
        System.out.print(duck.getName());
        duck.performFly();

        System.out.println();
        //测试模型鸭
        duck = new ModelDuck15("克拉克");
        duck.display();
        duck.swim();
        System.out.print(duck.getName());
        duck.performQuack();
        System.out.print(duck.getName());
        duck.performFly();
        //模型鸭进行变身
        System.out.println(duck.getName() + ": 改造...");
        duck.setFlyBehavior(new FlyWithRocket());
        System.out.print(duck.getName());
        duck.performFly();
    }
}
