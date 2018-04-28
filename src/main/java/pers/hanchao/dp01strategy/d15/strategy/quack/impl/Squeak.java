package pers.hanchao.dp01strategy.d15.strategy.quack.impl;

import pers.hanchao.dp01strategy.d15.strategy.quack.QuackBehavior;

/**
 * <p>呱呱叫行为的抽象类-吱吱叫</p>
 * @author hanchao 2018/4/28 22:28
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(": 正在吱吱叫。");
    }
}
