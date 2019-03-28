package ch03.sec07;

public class ScopeDemo {
    public static void main(String[] args) {
        repeatMessage("Hello", 10);

        // 향상된 for 루프의 변수는 유효 범위가 단일 반복(single iteration)이므로 사실상 최종이다.
        //따라서 다음은 규칙에 들어맞는 코드다.
        for (String a : args) 
            new Thread(() -> System.out.println(a));

        /*
        for(int i = 0; i < 10; i++) {
            new Thread( () -> System.out.println(i)).start();// 오류 - i를 캡처할 수 없다.
        }
        */
    }

    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        new Thread(r).start();                  
     }
}
