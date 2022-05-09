package exercise;

import java.util.Scanner;

public class Exam032301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        evenOdd(num);
    }

    public static void evenOdd(int num){
        if(num % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
