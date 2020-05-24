package StrategyMode;

import java.math.BigDecimal;

public interface Buyer {

    /**
     * 计算应付价格
     */
    public BigDecimal calPrice(BigDecimal orderPrice);

}
