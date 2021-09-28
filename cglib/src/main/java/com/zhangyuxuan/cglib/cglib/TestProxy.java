package com.zhangyuxuan.cglib.cglib;


import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/9/25 下午2:22 周六
 */
public class TestProxy {
    public static void main(String[] args) {

        //设置动态代理生成的class文件存放路径，设置这个system属性后，cglib就会自动把class文件输出，默认是不会输出到磁盘上的
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/zhangyuxuan/eclipse-workspace/practice2021-09-07/cglib/src/main");

        //代理类
        TargetProxy targetProxy = new TargetProxy();
        //拿到目标类的代理类
        TargetInterfaceImpl proxyClass = targetProxy.getProxy(TargetInterfaceImpl.class);
        System.out.println(proxyClass.sayHello("zhangsan"));

        //代理接口
        TargetInterfaceProxy targetInterfaceProxy = new TargetInterfaceProxy();
        //拿到目标接口的代理类
        TargetInterface proxyInterface = targetInterfaceProxy.getProxy(TargetInterface.class);
        System.out.println(proxyInterface.sayHello("zhangsan"));

        //代理类
        TargetProxy targetProxy2 = new TargetProxy();
        //拿到目标类的代理类
        UserService proxyClass2 = targetProxy2.getProxy(UserService.class);
        proxyClass2.thinking();
    }
}
