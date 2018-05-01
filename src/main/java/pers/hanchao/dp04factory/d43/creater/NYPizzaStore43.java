package pers.hanchao.dp04factory.d43.creater;

import pers.hanchao.dp04factory.d43.product.NYStyleCheesePizza;
import pers.hanchao.dp04factory.d43.product.Pizza43;

/**
 * <p>纽约披萨店-creator的实现类</p>
 *
 * @author hanchao 2018/5/1 12:47
 **/
public class NYPizzaStore43 extends PizzaStore43 {
    @Override
    public Pizza43 createPizza(String type) {
        Pizza43 pizza = null;
        //选择披萨种类
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("greek")) {
            // NYStyleGreekPizza
        } else if (type.equals("pepperoni")) {
            // NYStylePepperoniPizza
        }
        //返回披萨
        return pizza;
    }
}
