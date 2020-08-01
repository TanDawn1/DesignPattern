package SimpleProxy.JDKProxy;

import java.util.ArrayList;

/**
 * 一个人 希望买一台最新的顶配 MacBook；
 * 另一个 希望买一台 MateBook
 * 寻找代购购买
 */
public class Main {

    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();

        Buyer1 buyer1 = new Buyer1();
        //创建动态代理类 & 对象：通过调用处理器类对象newProxyInstance（）
        ISubject buy1 = (ISubject) dynamicProxy.newProxyInstance(buyer1);
        System.out.println(1);
        //通过调用动态代理对象方法从而调用目标对象方法
        //实际上是调用了invoke（），再通过invoke（）里的反射机制调用目标对象的方法
        buy1.buy();

        ArrayList<String> list = new ArrayList<>();
      

        Buyer2 buyer2 = new Buyer2();

        ISubject buy2 = (ISubject) dynamicProxy.newProxyInstance(buyer2);

        buy2.buy();

    }

}
