package chap15Exercise;

public class Book1 {
    private static int count = 0;
    private String title;
    private int price;
    private int number;

    public Book1(String title, int price){
        count++;
        this.title = title;
        this.price = price;
        this.number = count;
    }
}
