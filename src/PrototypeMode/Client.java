package PrototypeMode;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.friend = new Sheep("tim",1,"白色");
        Sheep sheep2 = (Sheep) sheep.clone();

        /**
         * 浅拷贝
         * friend引用的是同一个对象，并没有进行拷贝
         */
        System.out.println("sheep: " + sheep.hashCode()+" "+sheep.toString() +"friend: "+sheep.friend.hashCode());
        System.out.println("sheep2:  "+sheep2.hashCode()+" "+sheep2.toString() +"friend: "+sheep2.friend.hashCode() );

    }

}
