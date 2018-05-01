package pers.hanchao.dp04factory.d44.client.pizza;

import pers.hanchao.dp04factory.d44.product.Cheese44;
import pers.hanchao.dp04factory.d44.product.Dough44;
import pers.hanchao.dp04factory.d44.product.Sauce44;

/**
 * <p>
 * 抽象工厂：product
 * </p>
 *
 * @author hanchao 2018/5/1 12:26
 **/
public abstract class Pizza44 {
    String name;//名字
    Cheese44 cheese;//奶酪
    Dough44 dough;//面团
    Sauce44 sauce;//酱汁

    public abstract void prepare();

    public void bake() {
        System.out.println("烘烤25分钟...");
    }

    public void cut() {
        System.out.println("将披萨切成对角片...");
    }

    public void box() {
        System.out.println("将披萨装进披萨盒中...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
