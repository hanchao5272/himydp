package pers.hanchao.dp03decorator.d32;

/**
 * <p>配料作为成员变量，每种咖啡是一个子类</p>
 * @author hanchao 2018/5/1 9:08
 **/
public class Demo32 {
    /**
     * <p></p>
     * @author hanchao 2018/5/1 9:08
     **/
    public static void main(String[] args) {
         //深焙咖啡
        Beverage32 darkRoast = new DarkRoast32();
        System.out.println(darkRoast.getDescription() + ":" + darkRoast.cost());
        //牛奶深焙咖啡
        Beverage32 darkRoast1 = new DarkRoast32();
        darkRoast1.setMilk(true);
        System.out.println(darkRoast1.cost() + ":" + darkRoast1.getDescription());
        //豆浆奶泡摩卡咖啡
        Beverage32 darkRoast2 = new DarkRoast32();
        darkRoast2.setMocha(true);
        darkRoast2.setSoy(true);
        darkRoast2.setWhip(true);
        System.out.println(darkRoast2.cost() + ":" + darkRoast2.getDescription());
    }
}
