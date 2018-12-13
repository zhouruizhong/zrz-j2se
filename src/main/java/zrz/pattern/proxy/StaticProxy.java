package zrz.pattern.proxy;

/**
 * @author zhouruizhong
 * @date 2018/12/6 16:40
 */
public class StaticProxy {

    /**
     * 商品接口
     */
    static interface Goods {
        public void trade();
    }

    /**
     * 商品产地类
     */
    static class ChangJia implements Goods {
        @Override
        public void trade() {
            System.out.println("厂家生产商品");
        }
    }

    /**
     * 商品代理类
     */
    static class JingXiaoShang implements Goods {
        private ChangJia changJia;

        public JingXiaoShang(ChangJia changJia) {
            this.changJia = changJia;
        }

        @Override
        public void trade() {
            System.out.println("厂家生产产品，成本为1000元");
            changJia.trade();
            System.out.println("经销商卖出商品，利润为100元");
        }
    }

    // 用户购买东西
    public static void main(String[] args) {
        Goods proxy = new JingXiaoShang(new ChangJia());
        proxy.trade(); // 商品被交易
    }

}
