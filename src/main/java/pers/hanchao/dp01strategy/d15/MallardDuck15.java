package pers.hanchao.dp01strategy.d15;

import pers.hanchao.dp01strategy.d15.strategy.fly.impl.FlyWithWings;
import pers.hanchao.dp01strategy.d15.strategy.quack.impl.Quack;

/**
 * <p>绿头鸭</p>
 * @author hanchao 2018/4/28 22:41
 **/
public class MallardDuck15 extends Duck15{
    public MallardDuck15(String name) {
        super("绿头鸭" + name);
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println(super.getName() + ": 外表是绿头鸭");
    }
}
