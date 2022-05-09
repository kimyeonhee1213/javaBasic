package chap11;

class Computer9{
    String os;
    int memory;

    public void showComputer(){
        System.out.println("PC 정보를 표시합니다.");
        this.show();
    }

    public void show(){
        System.out.println("OS는 "+this.os+"입니다.");
        System.out.println("메모리는 "+this.memory+"GB입니다");
    }

    public String getOs(){
        return this.os;
    }

    public int getMemory(){
        return this.memory;
    }

    public void setOsMemory(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 "+os+"이고, 메모리는 "+memory+"GB입니다");
    }
}
public class ThisKeyWord {
    public static void main(String[] args) {
        Computer9 com = new Computer9();

        com.os = "Window 11";
        com.memory = 16;

        System.out.println("PC OS는 "+com.getOs()+"입니다.");
        System.out.println("메모리는 "+com.getMemory()+"GB입니다");

        com.setOsMemory("Window 10",8);

        com.showComputer();
    }
}
