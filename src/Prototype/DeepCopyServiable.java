package Prototype;

import java.io.*;

public class DeepCopyServiable {
    public static void main(String[] args) throws Exception {
        Teacher3 t = new Teacher3();
        t.setName("Taylor");
        t.setAge(28);

        Student3 s1 = new Student3();
        s1.setAge(20);
        s1.setName("blank space");
        s1.setTeacher(t);

        Student3 s2 = (Student3) s1.deepClone();

        System.out.println("拷贝后:");
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getTeacher().getName());
        System.out.println(s2.getTeacher().getAge());
        System.out.println("---------------------------");

        t.setName("swift");

        System.out.println("修改后：");
        System.out.println(s1.getTeacher().getName());
        System.out.println(s2.getTeacher().getName());
    }
}

class Teacher3 implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Student3 implements Serializable {
    private String name;
    private int age;
    private Teacher3 teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher3 getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher3 teacher) {
        this.teacher = teacher;
    }

    public Object deepClone() throws Exception {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }
}

