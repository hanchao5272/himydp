package pers.hanchao.dp3decorator.d31;

import pers.hanchao.dp3decorator.d32.Beverage32;

/**
 * <p>每种组合都是一个子类</p>
 * @author hanchao 2018/5/1 9:05
 **/
public class Demo31 {
    /**
     * <p></p>
     * @author hanchao 2018/5/1 9:05
     **/
    public static void main(String[] args) {
        //定义三种咖啡
        Beverage31 darkRoast = new DarkRoast31();
        Beverage31 mochaDarkRoast = new MochaDarkRoast31();
        Beverage31 whipMochaDarkRoast = new WhipMochaDarkRoast31();
        //打印咖啡名字和价格
        System.out.println(darkRoast.getDescription() + ":" + darkRoast.cost());
        System.out.println(mochaDarkRoast.getDescription() + ":" + mochaDarkRoast.cost());
        System.out.println(whipMochaDarkRoast.getDescription() + ":" + whipMochaDarkRoast.cost());
    }
}
