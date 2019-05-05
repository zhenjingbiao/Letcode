package test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ShopHandler implements InvocationHandler {

    private Object object;
    public ShopHandler(Object base){
        object=base;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("doShop".equals(method.getName())){
            int money= (int) args[0];
            int realCost=money-1;
            System.out.println("收取代理费1元,"+"真正购物花费:"+realCost);
            Object[]things= (Object[]) method.invoke(object,realCost);
            return things;

        }
        return null;
    }
}
