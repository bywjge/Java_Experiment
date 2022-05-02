package Chapter2.Three;

import java.util.Objects;
import java.util.Scanner;

public class Minus {

    public static int[] na = new int[10500];
    public static int[] nb = new int[10500];
    public static int[] res = new int[11000];
    public static int counter=0;

    static void sub(String a,String b)
    {
        int lena=a.length();
        int lenb=b.length();
        for (int i = lena-1; i >=0 ; i--)
        {
            na[lena-i] = a.charAt(i)-'0';
        }
        for (int i = lenb-1; i >=0 ; i--)
        {
            nb[lenb-i] = b.charAt(i)-'0';
        }
        for (int i = 1 ; i <=lena ; i++)
        {
            if(na[i]<nb[i]){na[i+1]-=1; na[i]+=10;}
            res[counter++]=na[i]-nb[i];
        }
        counter--;
    }

    public static void main(String[] args) {
        String  a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入被减数:");
        a = scanner.nextLine();
        System.out.println("请输入减数:");
        b = scanner.nextLine();
        boolean isnegative=false;
        if (Objects.equals(a, b)){
            System.out.println(0);
            return ;
        }
        boolean flag = a.compareTo(b) >= 0;
        if( (a.length()==b.length() && flag) || a.length()>b.length())
        {
            sub(a,b);
        } else {
            sub(b,a);
            isnegative=true;
        }
        while (res[counter]==0) {counter--;} //针对10001-10000 计算出结果为 10000 的情况 倒序输出的时候不需要输出前置0
        if(isnegative){
            System.out.print('-');
        }
        for (int i = counter; i >= 0; i--)
        {
            System.out.print(res[i]);
        }
        System.out.println();
    }
}
