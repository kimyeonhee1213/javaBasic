package exercise;

import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,7,0,8,4,1,9,6,5,2};
        System.out.print("요소 번호 입력: ");
        int i = sc.nextInt();
        while(i < arr.length){
            System.out.println(i+"번째 요소 번호의 요소 값: "+ arr[i]);
            i = arr[i];
            if(i == 2){
                break;
            }
        }
    }
}
