package Chapter9.Four;

import java.math.BigInteger;

public class MorePracticeOne {
    public static void main(String[] args) {
        BigInteger n1=new BigInteger("101");
        BigInteger result=new BigInteger("1");
        BigInteger ONE = new BigInteger("1");
        for(BigInteger i=ONE; i.compareTo(n1)<=0; i=i.add(ONE)){
            result = result.multiply(i);
        }
        System.out.println(n1 + "的阶乘为：" + result);
    }
}
