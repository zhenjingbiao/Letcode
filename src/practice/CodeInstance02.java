package practice;

//题目：请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
public class CodeInstance02 {
    public static void main(String[] args) {

        String str="We Are Happy haha";
        System.out.println(replaceStr(new StringBuffer(str)));
        System.out.println(replaceStr2(new StringBuffer(str)));

    }
    public static String replaceStr(StringBuffer sb){
        if(sb!=null){
           String []strArray=sb.toString().split(" ");
           StringBuilder stringBuilder=new StringBuilder();
            for (int i = 0; i < strArray.length; i++) {
                if(i==strArray.length-1){
                    continue;
                }
                stringBuilder.append(strArray[i]);
                stringBuilder.append("%20");
            }
            stringBuilder.append(strArray[strArray.length-1]);
            return stringBuilder.toString();
        }
        return "";
    }
    public static String replaceStr2(StringBuffer stringBuffer){//\s表示空格，\\s进行转义
        return stringBuffer.toString().replaceAll("\\s","%20");
    }

}
