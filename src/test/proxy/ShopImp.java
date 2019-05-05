package test.proxy;

public class ShopImp implements Shop {

    @Override
    public Object[] doShop(int money) {
        System.out.println("正在逛淘宝");
        return new Object[]{"衣服","鞋子","书籍"};
    }
}
