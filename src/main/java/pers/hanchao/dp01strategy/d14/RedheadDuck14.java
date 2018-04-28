package pers.hanchao.dp01strategy.d14;

/**
 * <p>红头鸭</p>
 * @author hanchao 2018/4/28 22:04
 **/
public class RedheadDuck14 extends Duck14 implements Flyable,Quackable{

    public RedheadDuck14(String name) {
        super("红头鸭[" + name + "]");
    }

    /**
     * <p>外表</p>
     * @author hanchao 2018/4/28 22:02
     **/
    @Override
    public void display() {
        System.out.println(super.getName() + ": 外表是红头鸭。");
    }

    /**
     * <p>飞行</p>
     * @author hanchao 2018/4/28 22:03
     **/
    @Override
    public void fly() {
        System.out.println(super.getName() + "：正在飞行。");
    }

    /**
     * <p>呱呱叫</p>
     * @author hanchao 2018/4/28 22:03
     **/
    @Override
    public void quack() {
        System.out.println(super.getName() + ": 正在飞行。");
    }
}
