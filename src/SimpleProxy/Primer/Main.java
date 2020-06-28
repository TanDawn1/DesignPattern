package SimpleProxy.Primer;

/**
 * 追求者想送礼物给女生，但是害羞
 * 便找了个代理人，让他去送
 */
public class Main {

    public static void main(String[] args) {

        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("zxq");

        Proxy proxy = new Proxy(schoolGirl);

        proxy.GiveChocolate();
        proxy.GiveDolls();
        proxy.GiveFlowers();
    }

}
