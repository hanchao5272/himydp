package pers.hanchao.dp3decorator.d31;

/**
 * <p>奶泡摩卡深焙咖啡</p>
 * @author hanchao 2018/5/1 8:45
 **/
public class WhipMochaDarkRoast extends Beverage{
    public WhipMochaDarkRoast() {
        super.setDescription("奶泡摩卡深焙咖啡");
    }

    @Override
    public double cost() {
        return 0.10 + 0.20 + 0.99;
    }
}
