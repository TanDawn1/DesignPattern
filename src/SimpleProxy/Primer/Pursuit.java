package SimpleProxy.Primer;

/**
 * 追求者
 */
public class Pursuit implements IGiveGift {

    SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl){
        this.schoolGirl = schoolGirl;
    }

    public void GiveDolls(){
        System.out.println(schoolGirl.getName() + "送你娃娃");
    }

    public void GiveFlowers(){
        System.out.println(schoolGirl.getName() + "送你鲜花");
    }

    public void GiveChocolate(){
        System.out.println(schoolGirl.getName() + "送你巧克力");
    }


}
