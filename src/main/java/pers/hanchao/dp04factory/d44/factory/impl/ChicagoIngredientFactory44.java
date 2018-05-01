package pers.hanchao.dp04factory.d44.factory.impl;

import pers.hanchao.dp04factory.d44.factory.PizzaIngredientFactory44;
import pers.hanchao.dp04factory.d44.product.Cheese44;
import pers.hanchao.dp04factory.d44.product.Dough44;
import pers.hanchao.dp04factory.d44.product.Sauce44;
import pers.hanchao.dp04factory.d44.product.impl.ChicagoCheese44;
import pers.hanchao.dp04factory.d44.product.impl.ChicagoDough44;
import pers.hanchao.dp04factory.d44.product.impl.ChicagoSauce44;

/**
 * <p>芝加哥批量原材料生产工厂</p>
 * @author hanchao 2018/5/1 15:28
 **/
public class ChicagoIngredientFactory44 implements PizzaIngredientFactory44 {
    @Override
    public Dough44 createDough() {
        return new ChicagoDough44();
    }

    @Override
    public Cheese44 createCheese() {
        return new ChicagoCheese44();
    }

    @Override
    public Sauce44 createSauce() {
        return new ChicagoSauce44();
    }
}
