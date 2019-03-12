package ch01.sec04;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberDemo {
    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(876543210123456789L);
        BigInteger k = new BigInteger("9876543210123456789");
        //자바에서는 객체에 연산자를 사용할 수 없다.(String 객체에 + 연산자를 사용하는 경우는 예외)
        BigInteger r = BigInteger.valueOf(5).multiply(n.add(k)); // r = 5 * (n + k)
        System.out.println(r);
        System.out.println(2.0 - 1.1);
        /*
        * BigDecimal.valueOf(n,e)를 호출하면 값이 n * 10^e인 BigDecimal 인스턴스를 반환한다.
        * */
        BigDecimal d = BigDecimal.valueOf(2, 0).subtract(BigDecimal.valueOf(11, 1));
        System.out.println(d);
    }
}
