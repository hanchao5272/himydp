package pers.hanchao.dp04factory.d43.product;

/**
 * <p>芝加哥风格的奶酪披萨-product的实现类</p>
 * @author hanchao 2018/5/1 14:42
 **/
public class ChicagoCheesePizza  extends Pizza43 {
    public ChicagoCheesePizza() {
        name = "芝加哥风格的奶酪披萨";
        dough = "芝加哥风格的面团";
        sauce = "芝加哥风格的酱汁";
        toppings.add("芝加哥风格的浇料");
    }
    @Override
    public void cut(){
        System.out.println("将披萨切成方块...");
    }
}