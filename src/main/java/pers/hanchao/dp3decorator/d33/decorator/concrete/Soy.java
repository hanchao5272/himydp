package pers.hanchao.dp3decorator.d33.decorator.concrete;

import pers.hanchao.dp3decorator.d33.component.Beverage33;
import pers.hanchao.dp3decorator.d33.decorator.CondimentDecorator33;

/**
 * <p>配料豆浆-一种具体装饰者</p>
 * @author hanchao 2018/5/1 10:06
 **/
public class Soy extends CondimentDecorator33{
    private Beverage33 beverage;

    public Soy(Beverage33 beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "豆浆" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
