package chap13;

public class Score2 {
    private String name;
    private int[] score = new int[5];
    private int total;
    private double ave;

    public Score2(String name, int[] score,int total, double ave){
        this.name = name;
        for(int i = 0; i < this.score.length; i++){
            this.score[i] = score[i];
        }
        this.total = total;
        this.ave = ave;
    }

    public static void main(String[] args) {
        Score2 sc = new Score2("hello", new int[]{1,2,3,4,5},10,100.00);
    }
}
