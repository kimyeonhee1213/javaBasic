package chap18;

public class Computer1 {
    private  String os;
    private  int memory;

    public Computer1(){
        this.os = "";
        this.memory = 0;

        System.out.println("Pc가 만들어졌습니다.");
    }

    public void setComputer(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고 메모리는 " + memory + "GB로 설정되어있습니다.");
    }

    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
}
