package Chapter9.Two;

import java.util.StringTokenizer;

public class FoundPrice {
    public static void main(String[] args) {
        String s="牛奶:89.8元，香肠:12.9元 啤酒:69元 巧克力:132元";
        String regex="[^0123456789.]" ; //匹配非数字的正则表达式
        String digitMess=s.replaceAll(regex,"*");
//        System.out.println(digitMess);
        StringTokenizer fenxi=new StringTokenizer(digitMess, "*");//创建fenxi,用*做分隔标记解析digitMess中的单词
        int number=fenxi.countTokens();    //fenxi调用countTokens()方法返回单词数量
        double sum=0;
        while(fenxi.hasMoreTokens()) {
            String str=fenxi.nextToken();//fenxi调用nextToken()方法返回单词
            System.out.println(str);
            sum=sum+Double.parseDouble(str);
        }
        System.out.println("购物小票中的商品种类："+number+"种");
        System.out.println("购物小票中的价格总额："+sum+"元");
    }
}

