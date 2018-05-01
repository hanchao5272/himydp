package pers.hanchao.dp3decorator.d33.component;

/**
 * <p>
 *     饮料-抽象的Component类
 * </p>
 * @author hanchao 2018/5/1 9:51
 **/
public abstract class Beverage33 {
    /**饮料名称*/
    private String description;

    public Beverage33() {
        this.description = "一种饮料";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * 价格
     * @return
     */
    public abstract double cost();
}
