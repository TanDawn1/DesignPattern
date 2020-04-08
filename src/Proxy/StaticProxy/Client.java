package Proxy.StaticProxy;

public class Client {

    public static void main(String[] args){

        //代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //通过代理对象调用被代理对象方法
        teacherDaoProxy.teach();
    }

}
