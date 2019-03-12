package ch01.sec04;

public class ArithmeticDemo {
    public static void main(String[] args) {
        // 나눗셈과 나머지
        System.out.println(17 / 5);
        System.out.println(17 % 5);
        System.out.println(Math.floorMod(17, 5));

        System.out.println(-17 / 5);
        System.out.println(-17 % 5);
        System.out.println(Math.floorMod(-17, 5)); // 3

        // 증가와 감소
        int[] a = {17,29};
        int n = 0;
        System.out.printf("%d %d\n", a[n], n++);
        System.out.printf("%d %d\n", a[n++], n);
        n = 0;
        System.out.printf("%d %d\n", a[++n], n);

        // 제곱과 제곱근
        System.out.println(Math.pow(10,9));
        System.out.println(Math.sqrt(1000000));

        // 숫자 변환
        double x = 42;
        System.out.println(x); // 42.0

        /*
        * 다음 변환은 합법적이지만 정보를 잃을 수도 있다
        * int 에서 float로 변환
        * long에서 float,double로 변환
        * */
        float f = 123456789;
        System.out.println(f); // 1.23456792E8

        x = 3.75;
        n = (int) x;
        System.out.println(n); // 3

        n = (int) Math.round(x);
        System.out.println(n); // 4

        System.out.println('J' + 1); // 75
        char next = (char)('J' + 1);
        System.out.println(next); // 'K'

        /*
        * 더 작은 정수 타입으로 캐스트하면 하위 바이트들만 보존된다.
        * Note, 캐스트로 주요 숫자 부분이 소리 없이 사라져 벌리까 염려된다면 캐스트 대신 Math.toIntExact 메서드를 사용하자.
        * 이 메서드는 long을 int로 변환할 수 없을 때 예외를 일으킨다.
        * */
        n = (int) 3000000000L;
        System.out.println(n); // -1294967296
    }
}
