package ch02.sec05;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        /*
        * import static java.lang.Math.*;
        * 이 지시문을 소스 파일의 위쪽에 추가하면 클래스 이름을 접두어로 붙이지 않고도
        * Math 클래스의 정적 메서드와 정적 변수를 사용할 수 있다.
        * */
        double hypothenuse = sqrt(pow(x, 2) + pow(y, 2)); // Math.sqrt, Math.pow
        System.out.println(hypothenuse);        
    }
}
