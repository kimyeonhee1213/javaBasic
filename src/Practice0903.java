import java.util.Scanner;

public class Practice0903 {

    static void dispLine(int num){

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                outSign();
            }
            System.out.println();
        }
    }

    static void outSign(){
        System.out.print("* ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        dispLine(num);
    }
}
