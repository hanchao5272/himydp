package pers.hanchao.dp04factory.d41;

/**
 * <p>披萨店</p>
 * @author hanchao 2018/5/1 11:03
 **/
public class PizzaStore41 {
    Pizza41 orderPizza(String type){
        //定义一个披萨
        Pizza41 pizza = new Pizza41();
        //选择披萨种类
        if (type.equals("cheese")){
            pizza = new CheesePizza41();
        }else if (type.equals("greek")){
            pizza = new GreekPizza41();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza41();
        }
        //制作披萨
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        //返回披萨
        return pizza;
    }
    /**
     * <p></p>
     * @author hanchao 2018/5/1 11:11
     **/
    public static void main(String[] args) {
        PizzaStore41 pizzaStore = new PizzaStore41();
        Pizza41 pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);
        pizza = pizzaStore.orderPizza("greek");
        System.out.println(pizza);
    }
}
