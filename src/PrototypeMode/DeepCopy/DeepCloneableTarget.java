package PrototypeMode.DeepCopy;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;    //序列化uid

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //属性都为String，直接使用默认的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
