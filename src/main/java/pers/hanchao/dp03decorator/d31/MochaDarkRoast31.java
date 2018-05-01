package pers.hanchao.dp03decorator.d31;

/**
 * <p>摩卡深焙咖啡</p>
 * @author hanchao 2018/5/1 8:44
 **/
public class MochaDarkRoast31 extends Beverage31 {
    public MochaDarkRoast31() {
        super.setDescription("摩卡深焙咖啡");
    }

    @Override
    public double cost() {
        return 0.99 + 0.20;
    }
}
