package SimpleProxy.JDKProxy;

/**
 * 购买者1，想买MacBook
 */
public class Buyer1 implements ISubject{

    @Override
    public void buy() {
        System.out.println("1买了MacBook");
    }
}
