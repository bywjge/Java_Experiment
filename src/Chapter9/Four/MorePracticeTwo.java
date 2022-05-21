package Chapter9.Four;

import java.math.BigInteger;

public class MorePracticeTwo {
    public static void main(String[] args) {
        BigInteger n1=new BigInteger("99999999");
        BigInteger result=new BigInteger("0");
        BigInteger ONE = new BigInteger("1");
        for(BigInteger i=ONE; i.compareTo(n1)<=0; i=i.add(ONE)){
            result = result.add(i);
        }
        System.out.println("1+2+3…的前99 999 999项和为：" + result);
    }
}
