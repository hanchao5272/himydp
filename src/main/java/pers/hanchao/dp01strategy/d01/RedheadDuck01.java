package pers.hanchao.dp01strategy.d01;

/**
 * <p>红头鸭</p>
 * @author hanchao 2018/4/28 0:13
 **/
public class RedheadDuck01 extends Duck01{
    public RedheadDuck01(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println(super.getName() + ": 外观是红头鸭.");
    }
}
