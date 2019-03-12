package ch01.sec06;

public class inputFormat {
    public static void main(String[] args){

        // 부동소수점 수를 필드 폭은 8자리로 출력하고 정밀도는 2자리로 출력한다.
        //출력 결과는 앞쪽 빈칸 두 개와 문자 여섯 개다.
        System.out.printf("%8.2f", 1000.0 / 3.0); // 333.33
        System.out.println();
        System.out.printf("%,+.2f", 100000.0 / 3.0); // +33,333.33
    }
}
