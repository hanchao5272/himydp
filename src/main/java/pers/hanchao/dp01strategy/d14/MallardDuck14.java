package pers.hanchao.dp01strategy.d14;

/**
 * <p>绿头鸭</p>
 * @author hanchao 2018/4/28 21:59
 **/
public class MallardDuck14 extends Duck14 implements Flyable,Quackable{

    public MallardDuck14(String name) {
        super("绿头鸭[" + name + "]");
    }

    /**
     * <p>外表</p>
     * @author hanchao 2018/4/28 22:02
     **/
    @Override
    public void display() {
        System.out.println(super.getName() + ": 外表是绿头鸭。");
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
