package Factory.MethodFactory;

public class BjCheesePizza extends Pizza{

    public BjCheesePizza() {
        name = "BjCheesePizza";
    }

    void cut() {
        System.out.println("Cutting");
    }

}
