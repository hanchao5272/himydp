package pers.hanchao.dp04factory.d43.creater;

import pers.hanchao.dp04factory.d43.product.Pizza43;

/**
 * <p>工厂方法-creator</p>
 *
 * @author hanchao 2018/5/1 12:24
 **/
public abstract class PizzaStore43 {
    /**
     * 生成披萨,所有加盟店的共用方法
     *
     * @param type
     * @return
     */
    public Pizza43 orderPizza(String type) {
        //定义一个披萨
        Pizza43 pizza = createPizza(type);
        //制作披萨
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        //返回披萨
        return pizza;
    }

    /**
     * 创建披萨-抽象方法-由子类进行实例化
     */
    public abstract Pizza43 createPizza(String type);
}
