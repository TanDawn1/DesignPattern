package PrototypeMode.DeepCopy;

public class Client {

    public static void main(String[] args) {
        DeepProtoType p = new DeepProtoType();
        p.name = "np";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的np类");

       /* //方式1 深拷贝 不推荐！想想拷贝链表会怎样
        try {
            DeepProtoType p2 = (DeepProtoType) p.clone();

            //直接比较hashcode
            System.out.println("p: "+p.deepCloneableTarget.hashCode());
            System.out.println("p2: "+p2.deepCloneableTarget.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

       //方式2
        DeepProtoType p2 = (DeepProtoType) p.deepClone();

        //直接比较hashcode
        System.out.println("p: "+p.deepCloneableTarget.hashCode());
        System.out.println("p2: "+p2.deepCloneableTarget.hashCode());


    }

}
