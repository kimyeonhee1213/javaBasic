package chap10;

class Computer {
    String os;
    int memory;
}

public class MakeObject{
    public static void main(String[] args) {
        Computer com;
        com = new Computer();
        System.out.println("com = "+ com);
    }
}