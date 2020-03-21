package SimpleFactory;


public class Start {

    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggle");
        System.out.println("We ordered a " + pizza.getName() + "\n");

    }
}
