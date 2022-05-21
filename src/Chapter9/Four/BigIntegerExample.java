package Chapter9.Four;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger n1=new BigInteger("987654321987654321987654321");
        BigInteger n2=new BigInteger("123456789123456789123456789");
        BigInteger result;
        result=n1.add(n2);//n1和n2做加法运算
        System.out.println("和:"+ result);
        result=n1.subtract(n2);//n1和n2做减法运算
        System.out.println("差:"+ result);
        result=n1.multiply(n2);//n1和n2做乘法运算
        System.out.println("积:"+ result);
        result=n1.divide(n2);//n1和n2做除法运算
        System.out.println("商:"+ result);
        BigInteger m=new BigInteger("1968957"),
                COUNT=new BigInteger("0"),
                ONE=new BigInteger("1"),
                TWO=new BigInteger("2");
        System.out.println(m +"的因子有:");
        for(BigInteger i=TWO;i.compareTo(m)<0;i=i.add(ONE)){
            if((n1.remainder(i).compareTo(BigInteger.ZERO))==0) {
                COUNT=COUNT.add(ONE);
                System.out.print("  "+ i);
            }
        }
        System.out.println();
        System.out.println(m +"一共有"+ COUNT +"个因子");
    }
}
