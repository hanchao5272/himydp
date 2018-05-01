package pers.hanchao.dp04factory.d44.factory;

import pers.hanchao.dp04factory.d44.product.Cheese44;
import pers.hanchao.dp04factory.d44.product.Dough44;
import pers.hanchao.dp04factory.d44.product.Sauce44;

/**
 * <p>披萨原料工厂</p>
 * @author hanchao 2018/5/1 15:20
 **/
public interface PizzaIngredientFactory44 {
    public Dough44 createDough();
    public Cheese44 createCheese();
    public Sauce44 createSauce();
}
