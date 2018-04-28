package pers.hanchao.dp01strategy.d01;

/**
 * <p>诱饵鸭-不会飞、不会叫</p>
 * @author hanchao 2018/4/28 21:42
 **/
public class DecoyDuck01 extends Duck01{
    public DecoyDuck01(String name) {
        super(name);
    }

    /**
     * <p>诱饵鸭</p>
     * @author hanchao 2018/4/28 21:43
     **/
    @Override
    void display() {
        System.out.println(super.getName() + ": 外观是诱饵鸭。");
    }

    /**
     * <p>诱饵鸭不会飞</p>
     * @author hanchao 2018/4/28 21:43
     **/
    @Override
    void fly(){
        System.out.println(super.getName() + ": 不会飞行。");
    }

    /**
     * <p>诱饵鸭不会叫</p>
     * @author hanchao 2018/4/28 21:44
     **/
    @Override
    void quack(){
        System.out.println(super.getName() + ": 不会叫。");
    }

    /**
     * <p>诱饵鸭不会游泳</p>
     * @author hanchao 2018/4/28 21:44
     **/
    @Override
    void swim(){
        System.out.println(super.getName() + "：不会游泳。");
    }
}
