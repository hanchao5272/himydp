package pers.hanchao.dp01strategy.d14;

/**
 * <p>橡皮鸭</p>
 * @author hanchao 2018/4/28 22:04
 **/
public class RubberDuck14 extends Duck14 implements Quackable{

    public RubberDuck14(String name) {
        super("橡皮鸭[" + name + "]");
    }

    /**
     * <p>外表</p>
     * @author hanchao 2018/4/28 22:02
     **/
    @Override
    public void display() {
        System.out.println(super.getName() + ": 外表是橡皮鸭。");
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
