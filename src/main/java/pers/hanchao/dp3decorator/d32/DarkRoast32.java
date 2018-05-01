package pers.hanchao.dp3decorator.d32;

/**
 * <p>深焙咖啡</p>
 * @author hanchao 2018/5/1 9:01
 **/
public class DarkRoast32 extends Beverage32 {
    public DarkRoast32() {
        super.setDescription("深焙咖啡");
    }

    @Override
    public double cost() {
        return 0.99 + super.cost();
    }
}
