package ch01.exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {

        System.out.println("\n[문제6]\nBigInteger를 사용해 팩토리얼 n! = 1 x 2 x ... x n을 계산하는 프로그램을 작성하라.\n그리고 프로그램을 이용해 1,000!을 계산하라.\n");
        System.out.println("계산할 계승(Factorial)값을 입력하세요.");
        System.out.printf("계승값 : ");
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger result = factorial(n);

        System.out.println(n+"!의 값은 " + result + "입니다.");
    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger result;

        if (n.compareTo(BigInteger.ONE) <= 0) {
            result = n;
        } else {
            result = n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
        }

        return result;
    }
}
