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
        //绿头鸭
        Duck01 duck = new MallardDuck01("汤姆");
        duck.quack();
        duck.swim();
        duck.display();
        //红头鸭
        duck = new RedheadDuck01("杰瑞");
        duck.quack();
        duck.swim();
        duck.display();
    }
}
