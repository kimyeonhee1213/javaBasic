package chap13;

public class Score1 {
    private String name;
    private int[] score = new int[5];
    private int total;
    private double ave;

    public Score1(){
        this.name = null;
        this.score = new int[]{0,0,0,0,0};
        this.total = 0;
        this.ave = 0.0;
    }
}
