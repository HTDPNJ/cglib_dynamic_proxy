package com.hfut.pojo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Mishu implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("预约时间");
        //invoke()调用子类重写的方法
        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println("备注");
        return result;
    }
}
