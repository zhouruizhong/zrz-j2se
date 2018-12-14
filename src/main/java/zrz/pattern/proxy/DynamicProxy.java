package zrz.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhouruizhong
 * @date 2018/12/6 16:43
 */
public class DynamicProxy {

    /**
     * 商品接口
     */
    static interface Goods {
        /**
         * 交易
         */
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
     * 商品处理类
     */
    static class GoodsHandler implements InvocationHandler {
        /**
         * 要代理的对象，这里为商品
         */
        private Object object;

        public GoodsHandler(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // proxy 为生成的代理对象
            System.out.println("厂家生产产品，成本为1000元");
            Object result = method.invoke(object, args);
            System.out.println("经销商卖出商品，利润为100元");
            return result;
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // GoodHander类和ChangJia打交道
        GoodsHandler goodsHandler = new GoodsHandler(new ChangJia());
        // 先动态生成代理类，再生成代理类的对象
//        Class proxyClass = Proxy.getProxyClass(Goods.class.getClassLoader(),Goods.class.getInterfaces());
//        Goods proxy = (Goods) proxyClass.getConstructor(GoodsHander.class).newInstance(goodsHander);
        // 动态生成的代理对象，一步到位
        Goods proxy = (Goods) Proxy.newProxyInstance(Goods.class.getClassLoader(), Goods.class.getInterfaces(), goodsHandler);
        proxy.trade(); // 执行的是GoodsHander中的 invoke() 方法，然后是ChangJia中的 trade() 方法
    }

}
