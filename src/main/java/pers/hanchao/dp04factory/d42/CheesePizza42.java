package pers.hanchao.dp04factory.d42;

/**
 * <p>奶酪披萨</p>
 * @author hanchao 2018/5/1 10:59
 **/
public class CheesePizza42 implements Pizza42 {
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨的原材料");
    }

    @Override
    public void bake() {
        System.out.println("开始烘烤奶酪披萨");
    }

    @Override
    public void cut() {
        System.out.println("将奶酪披萨进行切分");
    }

    @Override
    public void box() {
        System.out.println("将奶酪披萨装进");
    }
}
