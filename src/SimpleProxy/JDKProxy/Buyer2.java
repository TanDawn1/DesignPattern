package SimpleProxy.JDKProxy;

/**
 * 购买者2，想购买MateBook
 */
public class Buyer2 implements ISubject{

    @Override
    public void buy() {
        System.out.println("2买MateBook");
    }
}
