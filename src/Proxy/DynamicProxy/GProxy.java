package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GProxy implements InvocationHandler {

    private Girl girl;

    public GProxy(Girl girl) {
        super();
        this.girl = girl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSomeThingBefore();
        Object ret = method.invoke(girl,args);
        doSomeThingEnd();
        return ret;
    }

    private void doSomeThingBefore(){
        System.out.println("前置通知");
    }

    private void doSomeThingEnd(){
        System.out.println("后置通知");
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(girl.getClass().getClassLoader(),girl.getClass().getInterfaces(),this);
    }

}
