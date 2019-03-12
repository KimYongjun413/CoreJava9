package ch01.sec06;

import java.io.Console;

public class inputPasswordDemo {
    public static void main(String[] args[]){
        //콘솔에서 실행하지 않는다면 System.console()의 반환값은 null
        Console console = System.console();

        System.out.print("아이디 : ");
        String id = console.readLine();

        System.out.print("비밀번호");
        char[] consolePassword = console.readPassword();
        String password = new String(consolePassword);

        System.out.println("----- 결과 -----");
        System.out.println(id);
        System.out.println(password);
    }
}
