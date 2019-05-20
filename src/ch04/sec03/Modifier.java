package ch04.sec03;

/*
* 열거에 정적 멤버를 넣을 수 있다. 하지만 생성 순서에 주의해야 한다. 열거 상수가 정적 멤버보다
* 먼저 생성되므로 열거 생성자에서 정적 멤버를 참조할 수 없다.
* */
public enum Modifier {
    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
    private int mask;

    // 정적 초기화 블록에서 초기화하여 열거생성자에서 정적 멤버를 참조할 수 있게 한다.
    // 열거 상수가 생성되고 나면 정적 변수 초기화와 정적 초기화 블록이 평소처럼 위쪽부터 차례로 실행된다.
    static {
        int maskBit = 1;
        for (Modifier m : Modifier.values()) {
            m.mask = maskBit;
            maskBit *= 2; 
        }
    }
    
    public int getMask() {
        return mask;
    }
}
