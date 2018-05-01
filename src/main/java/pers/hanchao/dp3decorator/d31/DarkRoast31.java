package pers.hanchao.dp3decorator.d31;

/**
 * <p>深焙咖啡</p>
 * @author hanchao 2018/5/1 8:43
 **/
public class DarkRoast31 extends Beverage31 {
    public DarkRoast31() {
        super.setDescription("深焙咖啡");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
