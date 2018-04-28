package pers.hanchao.dp01strategy.d15.strategy.fly.impl;

import pers.hanchao.dp01strategy.d15.strategy.fly.FlyBehavior;

/**
 * <p>飞行行为的实现类：想飞没门。</p>
 * @author hanchao 2018/4/28 22:26
 **/
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println(": 想飞没门。");
    }
}
