package ch01.exercise;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args){
        System.out.println("\n[문제1]\n정수를 읽어서 2진수, 8진수, 16진수로 출력하는 프로그램을 작성하라.\n읽어 온 정수의 역수를 16진 부동소수점 수로 출력하라.");
        System.out.printf("\n정수를 입력하세요. : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + "의 2진수 :" + Integer.toBinaryString(number));
        System.out.println(number + "의 8진수 :" + Integer.toOctalString(number));
        System.out.println(number + "의 16진수 :" + Integer.toHexString(number));

        // 역수 : 0이 아닌 어떤 수 a에 대하여 1을 그 수로 나눈 수 1/a
        System.out.println(number + "의 역수의 16진 부동소수점 수 :" + Double.toHexString(1.0/number));
    }
}
