package com.zhangyuxuan.cglib.proxy;

/**
 * @description: 静态代理示例
 * @author: zhangyuxuan
 * @date: 2021/9/25 下午12:38 周六
 */
public class TargetProxy implements TargetInterface {

    /**
     * 代理类持有接口类的引用
     */
    private TargetInterface targetInterface;

    /**
     * 使用构造方法对代理类所持有的接口类的引用进行初始化
     * @param targetInterface
     */
    public TargetProxy(TargetInterface targetInterface) {
        this.targetInterface = targetInterface;
    }

    public String sayHello(String name) {
        System.out.println("sayHello服务限流......");
        return targetInterface.sayHello(name);
    }

    public String sayThanks(String name) {
        System.out.println("sayThanks服务限流......");
        return targetInterface.sayThanks(name);
    }
}
