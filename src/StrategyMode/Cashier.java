package StrategyMode;


import java.math.BigDecimal;

public class Cashier {
    /**
     * 会员，策略对象
     */
    private Buyer buyer;

    public Cashier(Buyer buyer){
        this.buyer = buyer;
    }

    public BigDecimal quote(BigDecimal orderPrice) {
        return buyer.calPrice(orderPrice);
    }
}
