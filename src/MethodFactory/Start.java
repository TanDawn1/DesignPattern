package MethodFactory;


public class Start {

    public static void main(String[] args) {

       HNPizzaStore hn = new HNPizzaStore();
       BJPizzaStore bj = new BJPizzaStore();

       Pizza pizza = hn.orderPizza("cheese");

       pizza = bj.orderPizza("cheese");


    }
}
