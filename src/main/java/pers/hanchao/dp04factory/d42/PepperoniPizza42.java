package pers.hanchao.dp04factory.d42;

/**
 * <p>香肠披萨</p>
 * @author hanchao 2018/5/1 11:02
 **/
public class PepperoniPizza42 implements Pizza42 {
    @Override
    public void prepare() {
        System.out.println("准备香肠披萨的原材料");
    }

    @Override
    public void bake() {
        System.out.println("开始香肠克奶酪披萨");
    }

    @Override
    public void cut() {
        System.out.println("将格香肠披萨进行切分");
    }

    @Override
    public void box() {
        System.out.println("将格香肠披萨装进");
    }
}
