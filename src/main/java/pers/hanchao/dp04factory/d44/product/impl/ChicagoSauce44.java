package pers.hanchao.dp04factory.d44.product.impl;

import pers.hanchao.dp04factory.d44.product.Sauce44;
/**
 * <p>芝加哥面团</p>
 * @author hanchao 2018/5/1 15:35
 **/
public class ChicagoSauce44 implements Sauce44 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public ChicagoSauce44() {
        name = "芝加哥酱汁";
    }
}