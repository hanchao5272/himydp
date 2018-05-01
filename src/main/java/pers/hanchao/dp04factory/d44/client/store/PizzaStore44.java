package pers.hanchao.dp04factory.d44.client.store;

import pers.hanchao.dp04factory.d44.client.pizza.Pizza44;

/**
 * <p>抽象工厂-client</p>
 *
 * @author hanchao 2018/5/1 12:24
 **/
public abstract class PizzaStore44 {
    /**
     * 生成披萨,所有加盟店的共用方法
     *
     * @param type
     * @return
     */
    public Pizza44 orderPizza(String type) {

        //定义一个披萨
        Pizza44 pizza = createPizza(type);
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
    public abstract Pizza44 createPizza(String type);
}
