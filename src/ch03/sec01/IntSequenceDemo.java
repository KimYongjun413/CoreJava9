package ch03.sec01;

public class IntSequenceDemo {
    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void main(String[] args) {
        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);
        System.out.println("Average of first 100 squares: " + avg);

        IntSequence digits = new DigitSequence(1729);
        while (digits.hasNext()) System.out.print(digits.next() + " ");
        System.out.println();

        digits = new DigitSequence(1729);
        avg = average(digits, 100);
        // 처음 네 개 시퀀스 값만 살펴본다.
        System.out.println("Average of the digits: " + avg);

        IntSequence sequence = new DigitSequence(1234);

        //슈퍼타입 -> 서브타입 으로 변환 할 때
        // 예외가 일어나지 않게 하기위해 객체가 원하는 타입인지 instanceof 연산자로 검사
        //instanceof 연산자는 null에 안전하다.
        if(sequence instanceof DigitSequence) {
            DigitSequence digits2 = (DigitSequence) sequence;//캐스트(강제변환)
            System.out.println(digits2.rest());
        }


    }
}
