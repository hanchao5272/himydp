package pers.hanchao.dp04factory.d44.product.impl;

import pers.hanchao.dp04factory.d44.product.Sauce44;

/**
 * <p>纽约酱汁</p>
 *
 * @author hanchao 2018/5/1 15:31
 **/
public class NYSauce44 implements Sauce44 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public NYSauce44() {
        name = "纽约酱汁";
    }
}