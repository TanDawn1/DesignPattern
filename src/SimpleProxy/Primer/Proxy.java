package SimpleProxy.Primer;

/**
 * 代理送礼物的对象
 */
public class Proxy implements IGiveGift{

    private  Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl){
        pursuit = new Pursuit(schoolGirl);
    }

    public void GiveDolls(){
        pursuit.GiveDolls();
    }

    public void GiveFlowers(){
       pursuit.GiveFlowers();
    }

    public void GiveChocolate(){
       pursuit.GiveChocolate();
    }

}
