package pers.hanchao.dp04factory.d43.product;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *    工厂方法：product
 * </p>
 * @author hanchao 2018/5/1 12:26
 **/
public abstract class Pizza43 {
    String name;//名字
    String dough;//面团
    String sauce;//酱汁
    List toppings = new ArrayList<String >();

    public void prepare(){
        System.out.println("准备制作 " + name);
        System.out.println("揉面团...");
        System.out.print("添加酱汁:");
        toppings.forEach(item -> System.out.println(" " + item));
    }
    public void bake(){
        System.out.println("烘烤25分钟...");
    }
    public void cut(){
        System.out.println("将披萨切成对角片...");
    }
    public void box(){
        System.out.println("将披萨装进披萨盒中...");
    }

    public String getName() {
        return name;
    }
}
