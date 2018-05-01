package pers.hanchao.dp04factory.d44.factory.impl;

import pers.hanchao.dp04factory.d44.factory.PizzaIngredientFactory44;
import pers.hanchao.dp04factory.d44.product.Cheese44;
import pers.hanchao.dp04factory.d44.product.Dough44;
import pers.hanchao.dp04factory.d44.product.Sauce44;
import pers.hanchao.dp04factory.d44.product.impl.NYCheese44;
import pers.hanchao.dp04factory.d44.product.impl.NYDough44;
import pers.hanchao.dp04factory.d44.product.impl.NYSauce44;

/**
 * 纽约披萨原材料生产工厂
 */
public class NYPizzaIngredientFactory44 implements PizzaIngredientFactory44 {
    @Override
    public Dough44 createDough() {
        return new NYDough44();
    }

    @Override
    public Cheese44 createCheese() {
        return new NYCheese44();
    }

    @Override
    public Sauce44 createSauce() {
        return new NYSauce44();
    }
}
