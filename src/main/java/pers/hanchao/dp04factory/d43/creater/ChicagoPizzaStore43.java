package pers.hanchao.dp04factory.d43.creater;

import pers.hanchao.dp04factory.d43.product.ChicagoCheesePizza;
import pers.hanchao.dp04factory.d43.product.Pizza43;

/**
 * <p>芝加哥披萨店-creator的实现类</p>
 *
 * @author hanchao 2018/5/1 14:55
 **/
public class ChicagoPizzaStore43 extends PizzaStore43 {
    @Override
    public Pizza43 createPizza(String type) {
        Pizza43 pizza = null;
        //选择披萨种类
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("greek")) {
            // ChicagoGreekPizza
        } else if (type.equals("pepperoni")) {
            // ChicagoPepperoniPizza
        }
        //返回披萨
        return pizza;
    }
}
