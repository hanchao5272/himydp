package pers.hanchao.dp03decorator.d33.component.concrete;

import pers.hanchao.dp03decorator.d33.component.Beverage33;

/**
 * <p>综合咖啡</p>
 * @author hanchao 2018/5/1 9:57
 **/
public class HouseBlend33 extends Beverage33 {
    public HouseBlend33() {
        super.setDescription("综合咖啡");
    }

    /**
     * 综合咖啡的原始价格
     * @return
     */
    @Override
    public double cost() {
        return 0.89;
    }
}
