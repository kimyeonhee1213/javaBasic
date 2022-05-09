package chap18;

public class Practice1802 {
    public static void main(String[] args) {
        String[] title = {"Java 입문","Java 알고리즘","Java 알고리즘","Java Spring 프로그래밍","Java Spring 프로그래밍"};
        int[] price = {8000,12000,18000,25000,3000};

        Books[] book = new Books[5];

        for(int i = 0; i < book.length; i++){
           book[i] = new Books(title[i],price[i]);
        }

        System.out.println("=========================");
        for(int i = 0; i < book.length; i++){
            book[i].showBookInfo();
        }

    }
}
