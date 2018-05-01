package pers.hanchao.dp04factory.d44;

import pers.hanchao.dp04factory.d44.client.store.ChicagoPizzaStore44;
import pers.hanchao.dp04factory.d44.client.store.NYPizzaStore44;
import pers.hanchao.dp04factory.d44.client.store.PizzaStore44;

/**
 * <p>抽象工厂模式=测试</p>
 * @author hanchao 2018/5/1 19:11
 **/
public class Demo44 {
    /**
     * <p></p>
     * @author hanchao 2018/5/1 19:11
     **/
    public static void main(String[] args) {
        //创建披萨店
        PizzaStore44 nyStore = new NYPizzaStore44();
        PizzaStore44 chicagoStore = new ChicagoPizzaStore44();
        //下订单
        nyStore.orderPizza("cheese");
        System.out.println();
        chicagoStore.orderPizza("cheese");
    }
}
