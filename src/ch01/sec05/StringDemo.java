package ch01.sec05;

import java.time.ZoneId;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String location = "java";
        String greeting = "Hello " + location;
        System.out.println(greeting);

        int age = 42;
        String output = age + " years";
        System.out.println(output);

        System.out.println("Next Year, you will be " + age + 1); // 논리 오류
        System.out.println("Next Year, you will be " + (age + 1));

        String names = String.join(", ", "Peter","Paul","Mary");
        System.out.println(names);

        // 문자열 빌더
        StringBuilder builder = new StringBuilder();
        for(String id : ZoneId.getAvailableZoneIds()) {
            builder.append(id);
            builder.append(", ");
        }
        String result = builder.toString();
        System.out.println(result.substring(0, 200) + "...");
        System.out.println(result.length());

        // 부분 문자열
        greeting = "Hello, World!";
        location = greeting.substring(7, 12); // 7<= idx <= 12
        System.out.println(location);

        // 동등성 검사
        System.out.println(location.equals("World"));
        /*
        * 문자열을 비교할 때는 절대로 == 연산자를 사용하면 안 된다.
        * location == "world" 이렇게 비교하면 location과 "world"가 메모리에서 동일 객체 일 때만 true를 반환한다.
        * 가상 머신에는 각 리터럴 문자열의 인스턴스가 오직 한 개씩 있으므로
        * "world" == "world"로 비교해야 true가 된다.
        * String location = greeting.substring(7, 12);
        * 그러면 결과가 별도의 String 객체에 저장되고, location == "world"비교는 false를 반환한다.
        * */
        System.out.println(location == "world");
        System.out.println(location.equalsIgnoreCase("world"));
        System.out.println("world".compareTo("world"));

        // 숫자와 문자열 간 변환
        int n = 42;
        String str = Integer.toString(n, 2);
        System.out.println(str);

        n = Integer.parseInt(str);
        System.out.println(n);
        n = Integer.parseInt(str, 2);
        System.out.println(n);
        double x = Double.parseDouble("3.14");
        System.out.println(x);

        System.out.println(greeting.toUpperCase());
        System.out.println(greeting); // greeting은 변경되지 않았다.

        // 유니 코드
        String javatm = "Java\u2122";
        System.out.println(javatm);
        System.out.println(Arrays.toString(javatm.codePoints().toArray()));
        System.out.println(javatm.length());

        String octonions = "\ud835\udd46";
        System.out.println(octonions);
        System.out.println(Arrays.toString(octonions.codePoints().toArray()));
        System.out.println(octonions.length()); // 유니코드 코드 포인트가 아니라 코드 유닛을 센다.

    }
}
