package Chapter9.One;

public class FindMess {
    public static void main(String[] args) {
        String mess = "书名:Java程序设计,出版时间:2011.10.01,"+
                "出版社:清华大学出版社,价格:29.8 元,页数:389页";
        if(mess.contains("程序")) { //判断mess中是否含有"程序"
            System.out.println("图书信息包含有\"程序\"");
        }
        int index=mess.indexOf(":", mess.indexOf(":")+1);//mess调用indexOf(String s,int start)返回mess中第2个冒号的位置
        String date = mess.substring(index+1,index+11);
        System.out.println(date);
        int pricePosition=mess.indexOf("价格");//mess调用indexOf(String s)返回首次出现"价格"的位置
        int endPosition=mess.indexOf("元");
        String priceMess = mess.substring(pricePosition+3,endPosition);
        System.out.println("图书价格:"+priceMess);
        double price=Double.parseDouble(priceMess);
        if(price>=29) {
            System.out.println("图书价格"+price+"大于或等于29元");
        }
        else {
            System.out.println("图书价格"+price+"小于29元");
        }
        index = mess.lastIndexOf(":");//mess调用laseIndexOf(String s,int start)返回最后一个冒号位置
        endPosition=mess.lastIndexOf("页");
        String pageMess = mess.substring(index+1,endPosition);
        int p = Integer.parseInt(pageMess);
        if(p>=360) {
            System.out.println("图书的页数"+p+"大于或等于360");
        }
        else {
            System.out.println("图书的页数"+p+"小于360");
        }

        // 实验后的练习
        String str1 = new String("ABCABC"),
                str2 = null,
                str3 = null,
                str4 = null;
        str2 = str1.replaceAll("A", "First");
        str3 = str2.replaceAll("B", "Second");
        str4 = str3.replaceAll("C", "Third");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("12345的二进制、八进制、十六进制分别为");
        System.out.println(Long.toString(12345L, 2));
        System.out.println(Long.toString(12345L, 8));
        System.out.println(Long.toString(12345L, 16));

    }
}
