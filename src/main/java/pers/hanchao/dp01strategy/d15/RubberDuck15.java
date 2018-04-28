package pers.hanchao.dp01strategy.d15;

import pers.hanchao.dp01strategy.d15.strategy.fly.impl.FlyNoWay;
import pers.hanchao.dp01strategy.d15.strategy.fly.impl.FlyWithWings;
import pers.hanchao.dp01strategy.d15.strategy.quack.impl.Squeak;

/**
 * <p>橡皮鸭</p>
 * @author hanchao 2018/4/28 22:48
 **/
public class RubberDuck15 extends Duck15{
    public RubberDuck15(String name) {
        super("橡皮鸭" +name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    protected void display() {
        System.out.println(super.getName() +": 外表是橡皮鸭。");
    }
}
