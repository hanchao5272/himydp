package pers.hanchao.dp04factory.d44.client.store;

import pers.hanchao.dp04factory.d44.client.pizza.CheesePizza44;
import pers.hanchao.dp04factory.d44.client.pizza.Pizza44;
import pers.hanchao.dp04factory.d44.factory.PizzaIngredientFactory44;
import pers.hanchao.dp04factory.d44.factory.impl.NYPizzaIngredientFactory44;

/**
 * <p>纽约披萨店-client的实现类</p>
 *
 * @author hanchao 2018/5/1 12:47
 **/
public class NYPizzaStore44 extends PizzaStore44 {
    @Override
    public Pizza44 createPizza(String type) {
        Pizza44 pizza = null;
        PizzaIngredientFactory44 ingredientFactory = new NYPizzaIngredientFactory44();
        //选择披萨种类
        if (type.equals("cheese")) {
            pizza = new CheesePizza44(ingredientFactory);
            pizza.setName("纽约风格奶酪披萨");
        } else if (type.equals("greek")) {
            // GreekPizza
        } else if (type.equals("pepperoni")) {
            // PepperoniPizza
        }
        //返回披萨
        return pizza;
    }
}
