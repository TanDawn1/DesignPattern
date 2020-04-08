package Proxy.DynamicProxy;

public class GoodMan {

    public static void main(String[] args){
        //有一个好女孩
        GoodGirl goodGirl = new GoodGirl();
        //她有一个大家庭，想要约她出门必须得到她家的同意
        GProxy family = new GProxy(goodGirl);
        //有一次一个男孩去约她，碰上了她的妈妈并且争得了她妈妈的同意
        Girl mother = (Girl) family.getProxyInstance();
        //通过她的妈妈这个代理才能与女孩约会
        mother.Date();

        mother.WatchMovice();

    }

}
