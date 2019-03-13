package ch01.exercise;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args){

        System.out.println("\n[문제2]\n정수(양의 정수 또는 음의 정수)로 된 각도를 일고 0~359도 사이의 값으로 정규화하는 프로그램을 작성하라.\n(먼저 % 연산자를 사용한 후 floorMod 메서드를 이용해 작성한다).");
        System.out.printf("\n정수를 입력하세요. : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // -90 = 270, 365 = 5
        System.out.println("정규화 값 : " + normalization(number));
    }

    public static int normalization(int angle) {
        return Math.floorMod(angle % 360, 360);
    }
}
