package pers.hanchao.dp3decorator.d33.component;

import pers.hanchao.dp3decorator.d33.component.concrete.DarkRoast33;
import pers.hanchao.dp3decorator.d33.decorator.concrete.Mocha;
import pers.hanchao.dp3decorator.d33.decorator.concrete.Soy;
import pers.hanchao.dp3decorator.d33.decorator.concrete.Whip;

import java.io.InputStream;
import java.io.LineNumberInputStream;

/**
 * <p>装饰者模式</p>
 * @author hanchao 2018/5/1 10:09
 **/
public class Demo33 {
    /**
     * <p></p>
     * @author hanchao 2018/5/1 10:09
     **/
    public static void main(String[] args) {
         //深焙咖啡
        Beverage33 beverage = new DarkRoast33();
        System.out.println(beverage.getDescription() + ":" + beverage.cost());
        //奶泡深焙咖啡
        Beverage33 beverage1 = new Whip(new DarkRoast33());
        System.out.println(beverage1.getDescription() + ":" + beverage1.cost());
        //豆浆奶泡双倍摩卡深焙咖啡
        Beverage33 beverage2 = new Soy(new Whip(new Mocha(new Mocha(new DarkRoast33()))));
        System.out.println(beverage2.getDescription() + ":" + beverage2.cost());
    }
}
