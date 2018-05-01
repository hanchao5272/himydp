package pers.hanchao.dp04factory.d44.product.impl;

import pers.hanchao.dp04factory.d44.product.Cheese44;

/**
 * <p>纽约奶酪</p>
 * @author hanchao 2018/5/1 15:29
 **/
public class NYCheese44 implements Cheese44 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public NYCheese44() {
        name = "纽约奶酪";
    }
}
