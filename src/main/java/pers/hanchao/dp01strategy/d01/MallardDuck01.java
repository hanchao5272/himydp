package pers.hanchao.dp01strategy.d01;

/**
 * <p>绿头鸭</p>
 * @author hanchao 2018/4/28 0:08
 **/
public class MallardDuck01 extends Duck01 {
    public MallardDuck01(String name) {
        super("绿头鸭[" + name + "]");
    }

    @Override
    void display() {
        System.out.println(super.getName() + ": 外观是绿头鸭.");
    }
}
