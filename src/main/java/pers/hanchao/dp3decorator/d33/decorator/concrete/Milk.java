package pers.hanchao.dp3decorator.d33.decorator.concrete;

import pers.hanchao.dp3decorator.d33.component.Beverage33;
import pers.hanchao.dp3decorator.d33.decorator.CondimentDecorator33;

/**
 * <p>配料牛奶-一种具体装饰者</p>
 * @author hanchao 2018/5/1 10:04
 **/
public class Milk extends CondimentDecorator33{
    private Beverage33 beverage;

    public Milk(Beverage33 beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "牛奶" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
