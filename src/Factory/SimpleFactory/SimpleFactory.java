package Factory.SimpleFactory;

public class SimpleFactory {

    public Pizza createPizza(String type){

        Pizza pizza = null;

        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("veggle".equals(type)){
            pizza = new VegglePizza();
        }

        return pizza;

    }

}
