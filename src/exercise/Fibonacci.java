package exercise;

public class Fibonacci {
    public static void main(String[] args) {

        for(int n = 11; n <= 20; n++){
            System.out.print(fibo(n) + " ");
        }
    }

    public static int fibo(int n){
        if(n <= 1){
            return n;
        }else{
            return fibo(n-2)+fibo(n-1);
        }
    }

}
