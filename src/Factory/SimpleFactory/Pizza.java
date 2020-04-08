package Factory.SimpleFactory;

public abstract class Pizza {

    protected String name;

    public void prepare(){
        System.out.println("准备材料");
    }

    public void bake(){
        System.out.println("烘烤");
    }

    public void cut(){
        System.out.println("裁切");
    }
    public void box(){
        System.out.println("包装");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
