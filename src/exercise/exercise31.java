package exercise;

public class exercise31 {
    public static void main(String[] args){
        int[] arr = {3,7,0,8,4,1,9,6,5,2};
        int i = 0;
        int count = 0;
        while(i < arr.length){
            System.out.println(i+"번째 요소 값에서 다음 요소 값 번호를 뺀 값: "+ (arr[i]-arr[i+1]));
            i++;

        }
    }
}
