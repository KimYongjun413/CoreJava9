package ch01.exercise;

public class exercise04 {
    public static void main(String[] args){
        System.out.println("\n[문제4]\ndouble 타입인 양수 값 중 가장 작은 값과 가장 큰 값을 출력하는 프로그램을 작성하라.\n(자바 API에서 Math.nextUp을 찾는다.)\n");
        System.out.println("double 타입인 양수 값 중 가장 작은 값 : " + Math.nextUp((double)0));
        System.out.println("double 타입인 양수 값 중 가장 큰 값 : " + Double.MAX_VALUE);
    }
}
