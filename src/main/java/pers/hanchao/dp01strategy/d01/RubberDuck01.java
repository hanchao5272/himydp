package pers.hanchao.dp01strategy.d01;

/**
 * <p>橡皮鸭子（不会飞）</p>
 * @author hanchao 2018/4/28 20:42
 **/
public class RubberDuck01 extends Duck01 {
    public RubberDuck01(String name) {
        super("橡皮鸭[" + name + "]");
    }

    @Override
    void display() {
        System.out.println(super.getName() + ": 外观是橡皮鸭.");
    }
}
