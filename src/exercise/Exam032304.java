package exercise;

import java.util.Scanner;

public class Exam032304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도 입력: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println(year + "년은 윤년이다.");
        }else{
            System.out.println(year + "년은 평년이다.");

        }
    }
}
