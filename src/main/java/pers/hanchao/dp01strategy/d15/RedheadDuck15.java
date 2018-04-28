package pers.hanchao.dp01strategy.d15;

import pers.hanchao.dp01strategy.d15.Duck15;
import pers.hanchao.dp01strategy.d15.strategy.fly.impl.FlyWithWings;
import pers.hanchao.dp01strategy.d15.strategy.quack.impl.Quack;

/**
 * <p>红头鸭</p>
 * @author hanchao 2018/4/28 22:46
 **/
public class RedheadDuck15 extends Duck15{
    public RedheadDuck15(String name) {
        super("红头鸭" + name);
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println(super.getName() + "：外表是红头鸭");
    }
}
