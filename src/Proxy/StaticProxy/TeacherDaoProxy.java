package Proxy.StaticProxy;

public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao iTeacherDao; //目标对象

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理...");
        iTeacherDao.teach();
        System.out.println("代理结束");
    }

}
