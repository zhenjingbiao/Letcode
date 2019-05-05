package test;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakhashMapTest {
    private static Map<String,byte[]> caches=new WeakHashMap<>();

    public static void main(String[]args) throws InterruptedException {
        for (int i=0;i<100000;i++){
            caches.put(i+"",new byte[1024*1024*10]);
            System.out.println("put num: " + i + " but caches size:" + caches.size());
        }
    }

}
