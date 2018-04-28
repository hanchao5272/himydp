package pers.hanchao.dp01strategy.d15;

import pers.hanchao.dp01strategy.d15.strategy.fly.FlyBehavior;
import pers.hanchao.dp01strategy.d15.strategy.quack.QuackBehavior;

/**
 * <p>通过策略模式进行问题解决</p>
 * @author hanchao 2018/4/28 22:21
 **/
public abstract class Duck15 {
    /** 鸭子的名字 */
    private String name;
    /** 飞行行为 **/
    protected FlyBehavior flyBehavior;
    /** 呱呱叫行为 **/
    protected QuackBehavior quackBehavior;

    public Duck15(String name) {
        this.name = "[" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>游泳</p>
     * @author hanchao 2018/4/28 21:57
     **/
    void swim(){
        System.out.println(this.name + ": 正在游泳。");
    }

    /**
     * <p>外观</p>
     * @author hanchao 2018/4/28 21:57
     **/
    protected abstract void display();

    /**
     * <p>执行飞行行为</p>
     * @author hanchao 2018/4/28 22:32
     **/
    void performFly(){
        flyBehavior.fly();
    }

    /**
     * <p>执行呱呱叫行为</p>
     * @author hanchao 2018/4/28 22:32
     **/
    void performQuack(){
        quackBehavior.quack();
    }
}
