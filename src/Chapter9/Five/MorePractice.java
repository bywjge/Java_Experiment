package Chapter9.Five;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorePractice {
    public static void main(String[] args) {
        String str = "清华大学出版社(http://www.tup.tsinghua.edu.cn)是著名出版社,主要出版计算机等方面的图书";
        Pattern pattern;
        Matcher matcher;
        String regex = "[(htp:/|w)\56?\\w+{1}\\p{Alpha}]";
        pattern = Pattern.compile(regex);  //使用regex初试化模式对象pattern
        matcher = pattern.matcher(str);   //得到检索str的匹配对象matcher
        while(matcher.find()) {
            String res = matcher.group();
            System.out.print(res);
        }
    }
}
