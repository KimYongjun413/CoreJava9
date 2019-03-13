package ch01.exercise;

public class exercise05 {
    public static void main(String[] args){
        System.out.println("\n16비트 부호 없는 정수의 최댓값 : " + (int) Character.MAX_VALUE );// 65535
        System.out.println("32비트 부호 있는 정수의 최댓값 : " + Integer.MAX_VALUE);// 2147483647

        double doubleVale1 = (int) Character.MAX_VALUE + 1;// 65536(오버플로가 발생하지 않는다!!)
        double doubleVale2 = Integer.MAX_VALUE + 1;// -2147483648(오버플로 발생!!)

        System.out.println("\n16비트 부호 없는 정수의 최댓값 + 1[(int) Character.MAX_VALUE + 1]은 오버플로가 발생하지 않아 올바른 결과 반환 : " + (int)doubleVale1);
        System.out.println("32비트 부호 있는 정수의 최댓값 + 1[Integer.MAX_VALUE + 1]은 오버플로가 발생하여 틀린 결과를 반환 : " + (int)doubleVale2);
    }
}
