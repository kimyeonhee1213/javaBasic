package chap13;

import java.util.concurrent.CountDownLatch;

class Computer1{
    private String os;
    private int memory;

    public Computer1(){
        this.os = null;
        this.memory = 0;
        System.out.println("PC가 생성되었습니다.");
        System.out.println("생성");
    }

    public void show(){
        System.out.println("PC의 OS는 "+ os + "입니다.");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        System.out.println("=== 인수 없는 생성자 실행 전 ===");
        Computer1 com = new Computer1();
        System.out.println("=== 인수 없는 생성자 실행 후 ===");
        com.show();
    }
}
