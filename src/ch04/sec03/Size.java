package ch04.sec03;

public enum Size {
    EXTRA_LARGE("XL"), LARGE("L"), MEDIUM("M"), SMALL("S");

    private String abbreviation;

    // 열거의 생성자는 언제나 비공개다. Size처럼 private 제어자를 생략해도 된다.
    // 하지만 열거 타입의 생성자를 public이나 protected로 선언하면 문법 오류가 일어난다.
    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
