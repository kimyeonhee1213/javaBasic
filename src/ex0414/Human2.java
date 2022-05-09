package ex0414;

import java.util.stream.IntStream;

public class Human2 {
    private final String name;
    private final int height;
    private int weight;

    Human2(String n, int h, int w){
        this.name = n;
        this.height = h;
        this.weight = w;
    }

    String getName(){
        return name;
    }

    int getHeight(){
        return height;
    }

    int getWeight(){
        return weight;
    }

    void gainWeight(int w){
        weight += w;
    }
}

class Human2Test{

    public static void main(String[] args) {
        Human2 gildong = new Human2("홍길동",172,60);
        Human2 sunshin = new Human2("이순신",170,60);

        gildong.gainWeight(4);
        sunshin.gainWeight(-5);

        System.out.println("이름: " + gildong.getName());
        System.out.println("신장: " + gildong.getHeight() + "cm");
        System.out.println("체중: " + gildong.getWeight() + "kg");

        System.out.println("이름: " + sunshin.getName());
        System.out.println("신장: " + sunshin.getHeight() + "cm");
        System.out.println("체중: " + sunshin.getWeight() + "kg");
    }
}