package exercise;

import java.util.Scanner;

public class Exam032303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액 입력: ");
        int price = sc.nextInt();

        for(int i = 0; i < (price/100); i++){
            for(int j = 0; j < (price/1000); j++){
                if((100 * i) + (1000 * j) == price){
                    if(j>i){
                        System.out.println("100원짜리 :"+ i +"개");
                        System.out.println("1000원짜리 :"+ j +"개");
                    }
                }
            }
        }
    }
}
