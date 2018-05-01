package pers.hanchao.dp04factory.d43;

import pers.hanchao.dp04factory.d43.creater.ChicagoPizzaStore43;
import pers.hanchao.dp04factory.d43.creater.NYPizzaStore43;
import pers.hanchao.dp04factory.d43.creater.PizzaStore43;
import pers.hanchao.dp04factory.d43.product.Pizza43;

/**
 * <p>工厂方法实例</p>
 * @author hanchao 2018/5/1 14:45
 **/
public class Demo43 {
    /**
     * <p></p>
     * @author hanchao 2018/5/1 14:46
     **/
    public static void main(String[] args) {
        //创建creator的具体实现类
        PizzaStore43 nyStore = new NYPizzaStore43();
        PizzaStore43 chicagoStore = new ChicagoPizzaStore43();
        //制作纽约风格奶酪披萨
        Pizza43 pizza1 = nyStore.orderPizza("cheese");
        System.out.println(pizza1.getName());
        System.out.println();
        //制造芝加哥风格奶酪风格
        Pizza43 pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println(pizza2.getName());
    }
}
