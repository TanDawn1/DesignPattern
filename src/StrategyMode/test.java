package StrategyMode;

import java.math.BigDecimal;

/**
 * 测试类
 */
public class test {

    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        Buyer strategy = new VipBuyer();
        //创建上下文
        Cashier cashier = new Cashier(strategy);
        //计算价格
        BigDecimal quote = cashier.quote(BigDecimal.valueOf(300));
        System.out.println("普通会员商品的最终价格为：" + quote.doubleValue());

        strategy = new SuperVipBuyer();
        cashier = new Cashier(strategy);
        quote = cashier.quote(BigDecimal.valueOf(300));
        System.out.println("超级会员商品的最终价格为：" + quote.doubleValue());
    }

}
