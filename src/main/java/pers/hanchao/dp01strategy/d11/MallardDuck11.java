package pers.hanchao.dp01strategy.d11;

/**
 * <p>绿头鸭</p>
 * @author hanchao 2018/4/28 0:08
 **/
public class MallardDuck11 extends Duck11 {
    public MallardDuck11(String name) {
        super("绿头鸭[" + name + "]");
    }

    @Override
    void display() {
        System.out.println(super.getName() + ": 外观是绿头鸭.");
    }
}
