package com.zhangyuxuan.cglib.proxy;

/**
 * @description:静态代理：代理模式
 * @author: zhangyuxuan
 * @date: 2021/9/25 下午2:22 周六
 */
public class TestProxy {
    public static void main(String[] args) {
        TargetProxy targetProxy = new TargetProxy(new TargetInterfaceImpl());
        System.out.println(targetProxy.sayHello("zhangSan"));
        System.out.println(targetProxy.sayThanks("zhangSan"));
    }
}
