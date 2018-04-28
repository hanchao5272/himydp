package pers.hanchao.dp01strategy.d11;

/**
 * <p>红头鸭</p>
 * @author hanchao 2018/4/28 0:13
 **/
public class RedheadDuck11 extends Duck11 {
    public RedheadDuck11(String name) {
        super("红头鸭[" + name + "]");
    }

    @Override
    void display() {
        System.out.println(super.getName() + ": 外观是红头鸭.");
    }
}
