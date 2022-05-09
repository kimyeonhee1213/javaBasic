package exercise;

public class Exam0323_answer {
    public static void main(String[] args) {
        question03(24500);
    }

    private static void question03(int money){
        int ball1 = money/1000;
        int ball2 = (money -(ball1*1000))/100;

        System.out.println("1000원 = " + ball1);
        System.out.println("100원 = " + ball2);
    }
}
