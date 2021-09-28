package com.zhangyuxuan.cglib.jdk;



/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/9/25 下午2:22 周六
 */
public class TestProxy {
    public static void main(String[] args) {
        //打印生成的class文件，在工作空间下
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        TargetProxy targetProxy = new TargetProxy(new TargetInterfaceImpl());
//        TargetInterface proxy = targetProxy.getProxy(TargetInterface.class);
        TargetProxy targetProxy = new TargetProxy();
        TargetInterface proxy = (TargetInterface) targetProxy.getProxy(new TargetInterfaceImpl());
        System.out.println(proxy.sayHello("lisi"));
    }
}
