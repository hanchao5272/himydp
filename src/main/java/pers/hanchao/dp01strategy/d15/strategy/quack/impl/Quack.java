package pers.hanchao.dp01strategy.d15.strategy.quack.impl;

import pers.hanchao.dp01strategy.d15.strategy.quack.QuackBehavior;

/**
 * <p>呱呱叫行为的实现类-真的呱呱叫</p>
 * @author hanchao 2018/4/28 22:27
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(": 真的呱呱叫。");
    }
}
