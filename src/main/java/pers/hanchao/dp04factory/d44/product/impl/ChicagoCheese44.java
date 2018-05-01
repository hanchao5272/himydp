package pers.hanchao.dp04factory.d44.product.impl;

import pers.hanchao.dp04factory.d44.product.Cheese44;

/**
 * <p>芝加哥奶酪</p>
 * @author hanchao 2018/5/1 15:32
 **/
public class ChicagoCheese44 implements Cheese44 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public ChicagoCheese44() {
        name = "芝加哥奶酪";
    }
}
