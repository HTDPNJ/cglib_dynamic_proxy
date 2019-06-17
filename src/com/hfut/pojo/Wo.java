package com.hfut.pojo;

import net.sf.cglib.proxy.Enhancer;

public class Wo {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Laozong.class);
        enhancer.setCallback(new Mishu());
        Laozong laozong=(Laozong)enhancer.create();
        laozong.chifan();
    }
}
