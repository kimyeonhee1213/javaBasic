package exercise;

public class triangleNumber {
    public static void main(String[] args) {
        for(int i = 6; i >= 1; i--){
            for(int j = 0; j < 6 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i*2 -1; k++){
                int count = 0;
                count++;
                System.out.print(k+count);
                
            }
            System.out.println();
        }
    }
}
