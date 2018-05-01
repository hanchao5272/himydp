package pers.hanchao.dp04factory.d44.client.pizza;

import pers.hanchao.dp04factory.d44.factory.PizzaIngredientFactory44;

/**
 * <p>奶酪披萨</p>
 * @author hanchao 2018/5/1 18:55
 **/
public class CheesePizza44 extends Pizza44 {
    PizzaIngredientFactory44 ingredientFactory;

    public CheesePizza44(PizzaIngredientFactory44 ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("准备制作 " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
