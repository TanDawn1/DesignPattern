package PrototypeMode.DeepCopy;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {

    public String name;

    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    //深拷贝 -方式1使用clone
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        //完成基本数据类型和String的克隆
        deep = super.clone();
        //对引用类型进行处理
        DeepProtoType deepProtoTyped = (DeepProtoType) deep;
        deepProtoTyped.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoTyped;
    }

    //深拷贝 - 方式2 通过对象序列化实现
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);  //用流的方式输出当前对象

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
