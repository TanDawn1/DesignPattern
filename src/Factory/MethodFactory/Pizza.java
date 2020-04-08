package Factory.MethodFactory;

public abstract class Pizza {

    String name;

    void prepare() {
        System.out.println("Prepare " + name);
    }

    void bake() {
        System.out.println("Bake");
    }

    void cut() {
        System.out.println("Cut");
    }

    void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }



}
