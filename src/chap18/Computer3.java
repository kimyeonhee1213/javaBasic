package chap18;

public class Computer3 {
    private String os;
    private int memory;

    public Computer3(){
        this.os = "";
    }

    public Computer3(String os, int memory){
        this.os = os;
        this.memory = memory;
    }

    public String getOs(){
        return os;
    }

    public int getMemory(){
        return memory;
    }

    public void setOs(String os){
        this.os = os;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    public void show(){
        System.out.println("PC OS는 " + this.os + "입니다.");
        System.out.println("메모리는 " + this.memory + "GB입니다.");
    }
}
