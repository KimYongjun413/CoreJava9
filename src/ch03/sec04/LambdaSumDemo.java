package ch03.sec04;

@FunctionalInterface
interface Math {
   int Calc(int value1, int value2);
}

class Calc {
    public int Sum(int value1, int value2) {
        return value1 + value2;
    }
}

public class LambdaSumDemo {
    public static void main(String[] args) {

        Math math = (a,b) -> a+b;
        System.out.println("Sum of result is " + math.Calc(3,4));

        math = (a,b) -> a-b;
        System.out.println("Sub of result is " + math.Calc(3,4));

        Calc calc = new Calc();
        System.out.println("Class result is " + calc.Sum(4,5));
    }
}
