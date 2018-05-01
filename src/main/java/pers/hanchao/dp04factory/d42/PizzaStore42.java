package pers.hanchao.dp04factory.d42;

/**
 * <p>披萨店</p>
 * @author hanchao 2018/5/1 11:03
 **/
public class PizzaStore42 {
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore42() {
        this.simplePizzaFactory = new SimplePizzaFactory();
    }

    //生成披萨
    Pizza42 orderPizza(String type){
        //定义一个披萨
        Pizza42 pizza = this.simplePizzaFactory.createPizza(type);
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
        PizzaStore42 pizzaStore = new PizzaStore42();
        Pizza42 pizza = pizzaStore.orderPizza("cheese");
        System.out.println();
        pizza = pizzaStore.orderPizza("greek");
    }
}
