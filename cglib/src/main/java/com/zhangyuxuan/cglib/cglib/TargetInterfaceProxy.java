package com.zhangyuxuan.cglib.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: 动态代理示例，这个类还不是真正的代理类，是代理类的一部分
 * @author: zhangyuxuan
 * @date: 2021/9/25 下午12:38 周六
 */
public class TargetInterfaceProxy implements MethodInterceptor {

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> clazz) {
        //字节码增强的一个类
        Enhancer enhancer = new Enhancer();
        //设置父类-把代理类作为父类，自己实现代理类，覆盖代理类中的方法
        enhancer.setSuperclass(clazz);
        //设置回调类-自己想附加的逻辑可以在回调类的intercept方法中编写
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    /**
     * 既可以拦截sayHello也可以拦截sayThanks
     * 个人理解：生成的代理类中会有对应的方法，对应的方法调用背后会有对应的逻辑来准备代理类对象、Method对象、入参和MethodProxy，作为回调方法intercept的入参
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(method.getName() + "服务限流......");

//        return methodProxy.invokeSuper(o, objects);
        //由于代理的是接口，所以这里就不能调用父类的方法了，需要自己写逻辑（相当于接口方法的实现，比如可以通过方法名判断，然后走不通的逻辑）
        return "Hello, " + objects[0];
    }
}
