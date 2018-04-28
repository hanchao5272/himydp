package pers.hanchao.dp01strategy.d15;

import pers.hanchao.dp01strategy.d15.strategy.fly.impl.FlyNoWay;
import pers.hanchao.dp01strategy.d15.strategy.quack.impl.MuteQuack;

/**
 * <p>诱饵鸭</p>
 * @author hanchao 2018/4/28 22:50
 **/
public class DecoyDuck15 extends Duck15{
    public DecoyDuck15(String name) {
        super("诱饵鸭" + name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    protected void display() {
        System.out.println(super.getName() + ": 外表是诱饵鸭");
    }
}
