package pers.hanchao.dp3decorator.d33.decorator.concrete;

import pers.hanchao.dp3decorator.d33.component.Beverage33;
import pers.hanchao.dp3decorator.d33.decorator.CondimentDecorator33;

/**
 * <p>摩卡配料-一个具体装饰者</p>
 *
 * @author hanchao 2018/5/1 10:00
 **/
public class Mocha extends CondimentDecorator33 {
    /**
     * 记录装饰对象--饮料
     */
    private Beverage33 beverage;

    public Mocha(Beverage33 beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "摩卡" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
