package com.zhangyuxuan.cglib.jdk;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/9/25 上午10:53 周六
 */
public class TargetInterfaceImpl implements TargetInterface {
    public String sayHello(String name) {
        return "Hello," + name;
    }

    public String sayThanks(String name) {
        return "Thanks," + name;
    }
}
