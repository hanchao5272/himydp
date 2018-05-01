package pers.hanchao.dp3decorator.d31;

/**
 * <p>饮料类</p>
 * @author hanchao 2018/5/1 8:36
 **/
public abstract class Beverage31 {
    /**饮料名称*/
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Beverage31() {
        this.description = "一种饮料";
    }

    /**
     * 价格
     * @return
     */
    public abstract double cost();
}
