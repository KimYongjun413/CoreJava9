package ch01.exercise;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        System.out.println("\n[문제3]\n조건 연산자만 사용해 정수 세 개를 읽고 최댓값을 출력하는 프로그램을 작성하라.\nMath.max를 사용해 같은 프로그램을 작성하라.\n");
        System.out.printf("정수 세 개를 입력하세요.(ex :10 20 30) : ");
        Scanner scanner = new Scanner(System.in);
        String[] strNumbers = scanner.nextLine().split(" ");
        int[] numbers = new int[3];
        for(int i = 0; i < strNumbers.length; i++){
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        System.out.printf("%d, %d, %d 중 최댓값은 %d 입니다.",numbers[0], numbers[1], numbers[2], Math.max(Math.max(numbers[0], numbers[1]) , numbers[2]));
    }
}
