package ch01.exercise;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        System.out.println("[문제7]\n0~4294967295 사이의 정수 두 개를 읽어서 int 변수에 저장한 후 부호 없는 합계, 차이, 곱, 몫, 나머지를\n");
        System.out.println("계산해 표시하는 프로그램을 작성하라(long 값으로 변환하지 않아야 한다.)\n");

        System.out.println("0~4294967295 사이의 정수 두 개를 입력하세요.");
        System.out.printf("입력 한 정수(ex :10 20) : ");
        Scanner n = new Scanner(System.in);
        String[] numbers = n.nextLine().split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        System.out.println("합계 : " + Math.addExact(a,b));
        System.out.println("차이 : " + Math.abs(Math.subtractExact(a,b)));
        System.out.println("곱 : " + Math.multiplyExact(a,b));
        System.out.println("몫 : " + Math.floorDiv(a,b));
        System.out.println("나머지 : " + Math.floorMod(a,b));


    }
}
