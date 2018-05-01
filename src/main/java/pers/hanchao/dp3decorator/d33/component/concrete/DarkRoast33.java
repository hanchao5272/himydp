package pers.hanchao.dp3decorator.d33.component.concrete;

import pers.hanchao.dp3decorator.d33.component.Beverage33;

/**
 * <p>深焙咖啡</p>
 * @author hanchao 2018/5/1 9:54
 **/
public class DarkRoast33 extends Beverage33 {
    public DarkRoast33() {
        super.setDescription("深焙咖啡");
    }

    /**
     * 深焙咖啡的原始价格
     * @return
     */
    @Override
    public double cost() {
        return 0.99;
    }
}
