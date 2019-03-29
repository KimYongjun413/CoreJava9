package ch04.sec01;

// ConcurrentWorker의 work 메서드는 run 메서드에서 슈퍼클래스(Worker)의 work 메서더를
// 호출하는 Runnable로 스레드를 생성한다.
public class ConcurrentWorker extends Worker {
    public void work() {
        Thread t = new Thread(super::work); // 객체 참조 대신 super를 사용할 수도 있다.
        t.start();
    }
}
