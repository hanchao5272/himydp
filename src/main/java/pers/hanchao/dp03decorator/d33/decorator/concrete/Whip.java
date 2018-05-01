package pers.hanchao.dp03decorator.d33.decorator.concrete;

import pers.hanchao.dp03decorator.d33.component.Beverage33;
import pers.hanchao.dp03decorator.d33.decorator.CondimentDecorator33;

/**
 * <p>配料奶泡-一种具体的装饰者</p>
 * @author hanchao 2018/5/1 10:07
 **/
public class Whip extends CondimentDecorator33{
    private Beverage33 beverage;

    public Whip(Beverage33 beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "奶泡" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
