package pers.hanchao.dp04factory.d43.product;

/**
 * <p>纽约风格的奶酪披萨-product的实现类</p>
 * @author hanchao 2018/5/1 13:56
 **/
public class NYStyleCheesePizza extends Pizza43 {
    public NYStyleCheesePizza() {
        name = "纽约风格的奶酪披萨";
        dough = "纽约风格的面团";
        sauce = "纽约风格的酱汁";
        toppings.add("纽约风格的浇料");
    }
}
