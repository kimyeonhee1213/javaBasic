package chap18;

public class Computer2 {
    private String os;
    private int memory;

    public Computer2(){
        this.os = "";
        this.memory = 0;
        System.out.println("PC를 만들었습니다.");
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
        System.out.println("PC os는 " + this.os + "입니다.");
        System.out.println("메모리는 " +this.memory+"GB입니다.");
    }
}
