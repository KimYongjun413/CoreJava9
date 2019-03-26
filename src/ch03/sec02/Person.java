package ch03.sec02;

public interface Person {
    String getName();
    //기본 메서드
    default int getId() { return 0; }
}
