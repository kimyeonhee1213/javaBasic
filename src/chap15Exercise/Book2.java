package chap15Exercise;

public class Book2 {
    private static int count = 0;
    private String title;
    private int price;
    private int number;

    public void showBook(){
        System.out.println("이 책의 제목은 " + this.title + ", 가격은 " + this.price
                + "입니다.");
        System.out.println("생성 번호는 " + this.number + "입니다.");
    }
}
