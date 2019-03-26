package ch03.sec03;

public class RunnableDemo {
    public static void main(String[] args) {

        //이 태스크를 새 스레드에서 실행하려면 Runnable로 스레드를 생성하고 시작해야 한다.
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Thread started");
    }
}

//특정 태스크(작업)을 별도의 스레드에서 수행하거나
//실행용 시레드 풀에 넣으려고 할 것이다. 태스크를 정의하려면
//Runnable 인터페이스를 구현해야 한다.
class HelloTask implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello, World!");
        }
    }
}
