package pers.hanchao.dp04factory.d42;

/**
 * <p>简单的披萨工厂</p>
 * @author hanchao 2018/5/1 11:26
 **/
public class SimplePizzaFactory {
    /**
     * <p>创建一个披萨</p>
     * @author hanchao 2018/5/1 11:27
     **/
    public Pizza42 createPizza(String type){
        //定义一个披萨
        Pizza42 pizza = null;
        //选择披萨种类
        if (type.equals("cheese")){
            pizza = new CheesePizza42();
        }else if (type.equals("greek")){
            pizza = new GreekPizza42();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza42();
        }
        //返回披萨
        return pizza;
    }
}
