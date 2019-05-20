package ch04.sec03;

public class EnumDemo {
    public static void main(String[] args) {
        // valueOf 메서드는 지정한 이름에 해당하는 인스턴스가 없으면 예외를 던진다.
        Size notMySize = Size.valueOf("SMALL");
        System.out.println(notMySize);

        // 향상된 for 루프에서 열거 타입의 모든 인스턴스를 순회할 때 values 메서드를 사용하면 된다.
        for (Size s : Size.values()) {
            System.out.println(s);
        }

        //ordinal 메서드는 enum 선언에서 인스턴스의 위리를 돌려준다.(0부터 시작)
        System.out.println(Size.MEDIUM.ordinal());
    }
}
