package Chapter9.Two;

import java.util.StringTokenizer;

public class MorePractice {
    public static void main(String[] args) {
        String s="1949年10月1日，中华人民共和国成立";
        String regex="[^0123456789.]" ; //匹配非数字的正则表达式
        String digit=s.replaceAll(regex,"#");
        StringTokenizer stringTokenizer = new StringTokenizer(digit, "#");
        while(stringTokenizer.hasMoreTokens()) {
            String str=stringTokenizer.nextToken();
            System.out.println(str);
        }
    }
}
