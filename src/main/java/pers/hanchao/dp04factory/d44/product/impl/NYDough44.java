package pers.hanchao.dp04factory.d44.product.impl;

import pers.hanchao.dp04factory.d44.product.Dough44;

/**
 * <p>纽约面团</p>
 *
 * @author hanchao 2018/5/1 15:30
 **/
public class NYDough44 implements Dough44 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public NYDough44() {
        name = "纽约面团";
    }
}