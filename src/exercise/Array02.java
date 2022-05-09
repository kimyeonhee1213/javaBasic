package exercise;

public class Array02 {
    public static void main(String[] args) {
        int[] num = {21,10,4,56,7,33,26,17,46,14};
        Sum(num);
    }

    public static void Sum(int[] num){
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
            if(sum > 100 || i == 9){
                    System.out.print(num[(num.length-1-i)]+" ");
            }
        }
    }
}
