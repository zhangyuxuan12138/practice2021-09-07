package com.zhangyuxuan.cglib.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 动态代理示例，这个类还不是真正的代理类，是代理类的一部分
 * 个人理解：其实这个类可以理解为是一个callback回调类
 * @author: zhangyuxuan
 * @date: 2021/9/25 下午12:38 周六
 */
public class TargetProxy implements InvocationHandler {

    /**
     * 持有目标接口的引用
     */
    private Object target;

    /**
     * 使用构造方法初始化目标接口类的引用
     *
     * @param target
     */
    public TargetProxy(Object target) {
        this.target = target;
    }

    public TargetProxy() {
    }

    /**
     * 通常应该用这种形式，绑定委托对象并返回代理对象
     * @param object
     * @return
     */
    public Object getProxy(Object object) {
        this.target = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    /**
     * 通过这种方式，可以只代理部分接口的方法
     * @param interfaces
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> interfaces) {
        return (T) Proxy.newProxyInstance(interfaces.getClassLoader(), new Class[]{interfaces}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "数据缓存......");
        return method.invoke(target, args);
    }
}
