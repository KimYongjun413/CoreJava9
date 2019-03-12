package ch01.sec01;

import java.util.Random;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("Hello, World".length());

        //새로 생성한 난수 발생기가 주는 정수의 다음 번 정수를 돌려준다.
        System.out.println(new Random().nextInt());

        //한 객체에서 메서드를 두 번 이상 호출하려면 해당 객체를 변수에 저장해야 한다.
        //여기서는 난수 두 개를 출력한다.
        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }
}
