package ch04.sec02;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object otherObject) {
        // 두 객체가 동일한지 알아보는 빠른 검사
        if (this == otherObject) return true;
        // 매개변수가 null이면 false를 반환해야 한다.
        if (otherObject == null) return false;
        // otherObject가 Item의 인스턴스인지 검사한다.
        if(getClass() != otherObject.getClass()) return false;
        // 인스턴스 변수들의 값이 동일한지 검사한다.
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
                && price == other.price;
    }

    // equals 메서드를 재정의한다면 hashCode 메서드도 재정의해서 equals와 호환되게 해야 한다.
    // 이렇게 하지 않으면 클래스의 사용자가 해시 집합이나 해시 맵에 객체를 넣다가 잃을 수도 있다.
    public int hashCode() { return Objects.hash(description, price);}
}
