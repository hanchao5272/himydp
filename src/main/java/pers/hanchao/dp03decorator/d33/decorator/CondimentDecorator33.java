package pers.hanchao.dp03decorator.d33.decorator;

import pers.hanchao.dp03decorator.d33.component.Beverage33;

/**
 * <p>配料装饰者-抽象Decorator类</p>
 * @author hanchao 2018/5/1 9:53
 **/
public abstract class CondimentDecorator33 extends Beverage33 {
    /**
     * 所有的具体装饰者都需要重写此方法
     * @return
     */
    public abstract String getDescription();
}
