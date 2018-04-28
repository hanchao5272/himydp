package pers.hanchao.dp01strategy.d15;

import pers.hanchao.dp01strategy.d15.strategy.fly.impl.FlyNoWay;
import pers.hanchao.dp01strategy.d15.strategy.quack.impl.MuteQuack;

/**
 * <p>模型鸭：初始状态不会飞，当改造之后，就能够火箭进行飞行</p>
 * @author hanchao 2018/4/28 23:05
 **/
public class ModelDuck15 extends Duck15 {

    public ModelDuck15(String name) {
        super("模型鸭" + name);
        //模型鸭开始不会飞
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    protected void display() {
        System.out.println(super.getName() + "：外表师模型鸭。");
    }
}

