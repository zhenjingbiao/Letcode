package test.proxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class DynamicProxyTest {
    public static void main(String []args){
        Shop shop=new ShopImp();
        System.out.println(Arrays.toString(shop.doShop(100)));

        shop= (Shop) Proxy.newProxyInstance(Shop.class.getClassLoader(),
                shop.getClass().getInterfaces(),new ShopHandler(shop));
        System.out.println(Arrays.toString(shop.doShop(100)));
    }
}
