package pers.hanchao.dp01strategy.d15.strategy.fly.impl;

import pers.hanchao.dp01strategy.d15.strategy.fly.FlyBehavior;

/**
 * <p>飞行行为的实现类-用火箭飞行</p>
 * @author hanchao 2018/4/28 23:09
 **/
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(": 通过火箭飞行。");
    }
}
