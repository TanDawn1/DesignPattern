package Prototype;

/**
 * 简历类
 */
public class Resume implements Cloneable{

    private String name;

    private String sex;

    private String age;

    private String company;

    private copyTest copyTest;

    public void setPersonalInfo(String sex, String age){
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String name, String company){
        this.name = name;
        this.company = company;
    }

    public void display(){
        System.out.println(name +" " + sex + " " + age);
        System.out.println(company);
    }


    @Override
    protected Resume clone() throws CloneNotSupportedException {
        //克隆
        Resume resume = null;
        resume = (Resume) super.clone();
        //还需要copy所指向的对象
        resume.setCopyTest((Prototype.copyTest) resume.getCopyTest().clone());
        return resume;
    }

    public void Resume(){
    }

    public copyTest getCopyTest() {
        return copyTest;
    }

    public void setCopyTest(copyTest copyTest) {
        this.copyTest = copyTest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
