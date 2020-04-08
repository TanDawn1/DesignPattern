package Factory.MethodFactory;

public class BJPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new BjCheesePizza();
        }

        return pizza;
    }
}
