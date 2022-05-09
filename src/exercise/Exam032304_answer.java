package exercise;

public class Exam032304_answer {
    public static void main(String[] args) {
        question04(2500);
    }

    private static void question04(int year){
        boolean check = false;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            check = true;
        }else{
            check = false;
        }
        System.out.println(check ? "윤년입니다" : "윤년이 아닙니다.");
    }
}
