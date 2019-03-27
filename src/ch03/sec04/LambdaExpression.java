package ch03.sec04;

//람다 표현식은 단일 추상 메서드를 가진 인터페이스 자리에 사용할 수 있다.
//이런 인터페이스를 함수형 인터페이스라고 한다.
/*(CoreJava9 p.151)
* 혹시라도 오해하지 않도록 덧붙이면, 인터페이스에 기본 메서드나 정적 메서드. 비공개 메서드가
* 여러 개 있다고 해도 추상 메서드가 한 개만 있다면 함수형 인터페이스다.
* */
interface Say {
    void something(int a, int b); // functional Interface
}

interface Hello {
    void something(String a, String b);
}

interface Sum {
    int getSum(int x, int y);
}

class Person {
    public void greeting(Say line) {
        line.something(6,7);
    }
    //오버로딩
    public void greeting(Hello line) {
        line.something("Hello","world");
    }

    public  void math(Sum sum) {
        int result = sum.getSum(3,5);
        System.out.println("result is " + result);
    }
}

public class LambdaExpression {
    public static void main(String[] args) {

        Person kim = new Person();
        System.out.println("Lambda 표현식 변경 전");
        System.out.println("================================");

        kim.greeting(new Say() {
            @Override
            public void something(int a, int b) {
                System.out.println("My name is KIm.");
                System.out.println("Noce to meet you!!");
                System.out.println("Parameter values are " + a + ", " + b);
            }
        });

        kim.math(new Sum() {
            @Override
            public int getSum(int x, int y) {
                return 7;
            }
        });

        System.out.println("\nLambda 표현식 변경 후");
        System.out.println("================================");

        kim.greeting( (int a, int b) -> {
            System.out.println("This is Kim.");
            System.out.println("Thank you Lambda");
        });

        kim.greeting((String a, String b) -> {
            System.out.println("Parameter values are " + a + ", " + b);
        });

        //매개변수가 있을 때
        kim.math( (a,b) -> 9);







    }
}
