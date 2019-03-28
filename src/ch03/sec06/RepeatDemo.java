package ch03.sec06;

import java.util.function.IntConsumer;

/*
* 람다를 사용하는 핵심 목적은 지연 실행(deferred execution)이다. 결국 어떤 코드를 지금 당장 실행하고 싶다면
* 굳이 람다로 감쌀 필요 없이 그냥 실행하면 되기 때문이다. 코드를 나중에 실행하는 이유는 다음과 같이 다양하다.
* 별도의 스레드에서 코드 실행
* 코드를 여러 번 실행
* 알고리즘에서 적절한 시점에 코드 실행(예를 들어 정렬에서 비교 연산)
* 어떤 일(버튼 클릭, 데이터 수신 등)이 일어날 때 코드 실행
* 필요할 때만 코드 실행
* */
public class RepeatDemo {

    public static void repeat(int n, Runnable action) {
        for(int i = 0; i < n; i++)
            action.run();//람다 표현식의 바디는 action.run()이 호출될 때 실행되다는 점을 염두에 둔다.
    }

    //intConsumer : int값 처리용 표준 인터페이스
    public static void repeat(int n, IntConsumer action) {
        for(int i = 0; i < n; i++)
            action.accept(i);
    }

    // 개선된 repeat 메서드
    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            for(int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }

    public static void main(String[] args) {
        repeat(10, () -> System.out.println("Hello, World!"));
        repeat(10, i -> System.out.println("Countdown: " + (9-i)));
        repeatMessage("hello", 10);
    }
}
