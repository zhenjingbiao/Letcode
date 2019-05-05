package test;

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
        CopyOnWriteArrayList<String> copyOnWriteArrayList=new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("苹果");
        copyOnWriteArrayList.add("西瓜");
        copyOnWriteArrayList.add("香蕉");
        copyOnWriteArrayList.add("桃子");
        for (String s : copyOnWriteArrayList) {
            if(s.equals("西瓜")){
                copyOnWriteArrayList.remove(s);
            }
           System.out.println("size"+copyOnWriteArrayList.size()+"----------------------s:"+s);
        }
        System.out.println(copyOnWriteArrayList.isEmpty());
      /*  long startTime1=System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            System.out.println(i);
        }
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
        long startTime2=System.currentTimeMillis();
        for(int i=0;i<1000;++i){
            System.out.println(i);
        }
        long endTime2=System.currentTimeMillis();
        System.out.println(endTime2-startTime2);*/

      /*  HashMap<String,Integer>map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
           System.out.println(entry.getKey()+"-------"+entry.getValue());
        }*/
//      String content="Hahhahah和GIF换个I6778889 哈哈哈哈哈。。。。。";
//       int startIndex=content.indexOf("#");
//       int lastIndex=content.lastIndexOf("#");
//       if(startIndex>=0&&startIndex!=lastIndex){
//           content=content.substring(startIndex+1,lastIndex);
//       }
//        System.out.println("startIndex:"+startIndex+"-----------lastIndex:"+lastIndex+"\n content"+content);

      /* final String temp="aihgfdhgkhglkjhgfdhgfdljhg";
       temp=temp.substring(1,4);
       System.out.println(temp);*/
    // System.out.println(Father.fa);

    }
   static class Father{
        public static  String fa="dljgvldjlkadjg";

        public Father(){
            System.out.println("father 被调用了。。。。。。2");
        }
   }

}
