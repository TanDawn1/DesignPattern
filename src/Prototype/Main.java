package Prototype;

public class Main {

    public static void main(String[] args) {

        Resume resumeA = new Resume();
        resumeA.setPersonalInfo("男","20");
        resumeA.setWorkExperience("ppp","tencent");
        resumeA.setCopyTest(new copyTest());
//        Resume resumeB = new Resume();
//        resumeB.setPersonalInfo("男","20");
//        resumeB.setWorkExperience("ppp","tencent");
//
//        Resume resumeC = new Resume();
//        resumeC.setPersonalInfo("男","20");
//        resumeC.setWorkExperience("ppp","tencent");
        //需要三次实例化！！！
//        resumeA.display();
//        resumeB.display();
//        resumeC.display();

        try {
            Resume resumeD = resumeA.clone();
            resumeA.display();
            System.out.println(resumeA);
            System.out.println(resumeD);
            resumeA.setPersonalInfo("女","20");
            resumeA.display();
            resumeD.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
