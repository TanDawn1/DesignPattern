package MethodFactory;

public class HNPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new HNCheesePizza();
        }


        return pizza;
    }
}
