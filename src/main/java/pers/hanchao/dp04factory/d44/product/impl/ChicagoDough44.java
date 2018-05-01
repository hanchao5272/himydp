package pers.hanchao.dp04factory.d44.product.impl;

import pers.hanchao.dp04factory.d44.product.Dough44;

/**
 * <p>芝加哥面团</p>
 *
 * @author hanchao 2018/5/1 15:33
 **/
public class ChicagoDough44 implements Dough44 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public ChicagoDough44() {
        name = "芝加哥面团";
    }
}