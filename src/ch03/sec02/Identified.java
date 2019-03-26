package ch03.sec02;

public interface Identified {
    //기본 메서드
    default int getId() { return Math.abs(hashCode()); } 
}
