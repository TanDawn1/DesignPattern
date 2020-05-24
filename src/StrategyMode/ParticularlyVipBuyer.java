package StrategyMode;

import java.math.BigDecimal;

/**
 * 专属会员
 */
class ParticularlyVipBuyer implements Buyer{
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        if(orderPrice.compareTo(new BigDecimal(30))>10){
            return orderPrice.multiply(new BigDecimal(0.7));
        }
        return null;
    }
}

/**
 * 超级会员
 */
class SuperVipBuyer implements Buyer{
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal(0.8));
    }
}

/**
 * 普通会员
 */
class VipBuyer implements Buyer{
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal(0.9));
    }
}
