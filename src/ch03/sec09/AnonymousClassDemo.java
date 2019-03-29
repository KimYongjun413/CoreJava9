package ch03.sec09;

import java.util.Random;

public class AnonymousClassDemo {
    private static Random generator = new Random();

    // LocalClassDemo에서는 반환 값을 생성할 목적으로 RandomSequence 라는 이름을
    // 딱 한번 사용 했다. 이 때는 클래스를 익명으로 만들어도 된다.
    public static IntSequence randomInts(int low, int high) {
        return new IntSequence() {
            public int next() { return low + generator.nextInt(high - low + 1); }
            public boolean hasNext() { return true; }
        };
    }

    public static void main(String[] args) {
        IntSequence dieTosses = randomInts(1, 6);
        for (int i = 0; i < 10; i++) System.out.println(dieTosses.next());
    }
}
