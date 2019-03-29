package ch03.sec09;

import java.util.Random;

public class LocalClassDemo {
    private static Random generator = new Random();

    // 주어진 범위에 있는 임의의 정수를 무한 시퀀스로 만들어 낸다.
    public static IntSequence randomInts(int low, int high) {
        class RandomSequence implements IntSequence {
            public int next() { return low + generator.nextInt(high - low + 1); }
            public boolean hasNext() { return true; }
        }

        return new RandomSequence();
    }

    public static void main(String[] args) {
        IntSequence dieTosses = randomInts(1, 6);
        for (int i = 0; i < 10; i++) System.out.println(dieTosses.next());
    }
}
