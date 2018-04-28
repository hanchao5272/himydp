package pers.hanchao.dp01strategy.d11;

/**
 * <p>橡皮鸭子（不会飞）</p>
 * @author hanchao 2018/4/28 20:42
 **/
public class RubberDuck11 extends Duck11 {
    public RubberDuck11(String name) {
        super("橡皮鸭[" + name + "]");
    }

    @Override
    void fly(){
        System.out.println(super.getName() + "：不会飞行.");
    }
    @Override
    void display() {
        System.out.println(super.getName() + ": 外观是橡皮鸭.");
    }
}
