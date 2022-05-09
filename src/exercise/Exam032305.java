package exercise;

import java.util.Scanner;

public class Exam032305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        for(int i = 2; i <= num; i++){
            for(;;){
                if(num % i == 0){
                    num /= i;
                    System.out.print( i + " ");
                }else{
                    break;
                }
            }
        }
    }
}
