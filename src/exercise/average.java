package exercise;

public class average {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        avg(num);
    }

    public static void avg(int[] num){
        int sum =0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        float average = sum/num.length;
        System.out.println(average);
    }
}
