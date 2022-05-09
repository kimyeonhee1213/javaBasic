package exercise;

public class KukudanMethod {
    public static void Kuku(int num){
        System.out.println("=== "+num+"단 ===");
        for(int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = "+(num*i));
        }
    }
    public static void main(String[] args) {
        Kuku(9);
    }
}
