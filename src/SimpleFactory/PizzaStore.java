package SimpleFactory;


public class PizzaStore {

    SimpleFactory factory;

    public PizzaStore(SimpleFactory factory){
        this.factory = factory;
    }


    public Pizza orderPizza(String type){

        Pizza pizza = null;

        pizza = factory.createPizza(type);

        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;

    }


}
