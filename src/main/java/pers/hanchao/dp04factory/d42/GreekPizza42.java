package pers.hanchao.dp04factory.d42;

/**
 * <p>格雷克比萨</p>
 * @author hanchao 2018/5/1 11:00
 **/
public class GreekPizza42 implements Pizza42 {
    @Override
    public void prepare() {
        System.out.println("准备格雷克披萨的原材料");
    }

    @Override
    public void bake() {
        System.out.println("开始格雷克奶酪披萨");
    }

    @Override
    public void cut() {
        System.out.println("将格雷克披萨进行切分");
    }

    @Override
    public void box() {
        System.out.println("将格雷克披萨装进");
    }
}
