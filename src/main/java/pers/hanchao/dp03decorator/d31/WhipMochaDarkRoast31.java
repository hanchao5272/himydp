package pers.hanchao.dp03decorator.d31;

/**
 * <p>奶泡摩卡深焙咖啡</p>
 * @author hanchao 2018/5/1 8:45
 **/
public class WhipMochaDarkRoast31 extends Beverage31 {
    public WhipMochaDarkRoast31() {
        super.setDescription("奶泡摩卡深焙咖啡");
    }

    @Override
    public double cost() {
        return 0.10 + 0.20 + 0.99;
    }
}
