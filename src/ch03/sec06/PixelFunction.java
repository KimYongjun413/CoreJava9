package ch03.sec06;

import java.awt.Color;

/*
* 이미지를 색채 패턴으로 채운다고 하자. 사용자는 각 픽셀에서 쓸 색을 만들어 주는 함수를
* 전달해야 한다. 그런데 (int, int) -> Color 매핑헤 해당하는 표준 타입은 없다.
* BiFunction<Integer, Integer, Color>를 사용해도 되지만, 그러면 오토박싱이 일어난다.
* 이런 상황에서는 새 인터페이스를 정의하는 것이 더 좋다.
* 오토박싱의 예 : Integer a = 3; // 내부적으로는 Integer a = new Integer(3); 으로 변환하여 동작
* */
@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}
