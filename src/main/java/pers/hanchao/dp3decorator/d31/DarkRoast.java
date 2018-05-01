package pers.hanchao.dp3decorator.d31;

/**
 * <p>深焙咖啡</p>
 * @author hanchao 2018/5/1 8:43
 **/
public class DarkRoast extends Beverage{
    public DarkRoast() {
        super.setDescription("深焙咖啡");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
