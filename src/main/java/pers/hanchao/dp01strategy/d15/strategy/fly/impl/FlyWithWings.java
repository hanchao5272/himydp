package pers.hanchao.dp01strategy.d15.strategy.fly.impl;

import pers.hanchao.dp01strategy.d15.strategy.fly.FlyBehavior;

/**
 * <p>飞行行为的实现类：用翅膀飞</p>
 * @author hanchao 2018/4/28 22:25
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(": 用翅膀飞。");
    }
}
