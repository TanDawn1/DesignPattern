package Proxy.DynamicProxy;

public class GoodGirl implements Girl {
    @Override
    public void Date() {
        System.out.println("开心");
    }

    @Override
    public void WatchMovice() {
        System.out.println("不喜欢这个电影");
    }
}
