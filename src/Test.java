import java.util.concurrent.CopyOnWriteArrayList;
public class Test {
    public static void main(String[] args) {
       /* Map<String, String> map = new HashMap<String, String>();
        map.put("apple", "苹果");
        map.put("watermelon", "西瓜");
        map.put("banana", "香蕉");
        map.put("peach", "桃子");

        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/
        CopyOnWriteArrayList<String>copyOnWriteArrayList=new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("苹果");
        copyOnWriteArrayList.add("西瓜");
        copyOnWriteArrayList.add("香蕉");
        copyOnWriteArrayList.add("桃子");
        for (String s : copyOnWriteArrayList) {
            System.out.println(s);
            copyOnWriteArrayList.remove("香蕉");
        }
    }

}
