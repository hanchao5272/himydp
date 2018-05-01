package pers.hanchao.dp03decorator.d32;

/**
 * <p>饮料类</p>
 * @author hanchao 2018/5/1 8:58
 **/
public class Beverage32 {
    /**饮料名称*/
    private String description;
    /** 牛奶 **/
    private boolean milk;
    /** 豆浆 **/
    private boolean soy;
    /** 摩卡 **/
    private boolean mocha;
    /** 奶泡 **/
    private boolean whip;
    /** 价格 **/
    private double cost;

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Beverage32() {
        this.description = "一种饮料";
    }

    /**
     * 价格
     * @return
     */
    public double cost(){
        //如果有牛奶
        if (isMilk()){
            cost += 0.10;
            setDescription("牛奶" + getDescription());
        }
        //如果有摩卡
        if (isMocha()){
            cost += 0.20;
            setDescription("摩卡" + getDescription());
        }
        //如果有豆浆
        if (isSoy()){
            cost += 0.15;
            setDescription("豆浆" + getDescription());
        }
        //如果有奶泡
        if (isWhip()){
            cost += 0.10;
            setDescription("奶泡" + getDescription());
        }
        return cost;
    };
}
