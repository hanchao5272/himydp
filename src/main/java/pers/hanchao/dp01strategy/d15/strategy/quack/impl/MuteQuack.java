package pers.hanchao.dp01strategy.d15.strategy.quack.impl;

import pers.hanchao.dp01strategy.d15.strategy.quack.QuackBehavior;

/**
 * <p>呱呱叫行为的抽象类-什么都不叫</p>
 * @author hanchao 2018/4/28 22:29
 **/
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println(": 不会叫。");
    }
}
