package exercise;

public class exercise30 {
    public static void main(String[] args){
        int[] arr = {3,7,0,8,4,1,9,6,5,2};
        int i = 0;
        int count = 0;
        while(i < arr.length){
            System.out.println(i+"번째 요소 번호의 요소 값: "+ arr[i]);
            i = arr[i];
            count ++;
            if(count == 10){
                break;
            }
        }
    }
}
