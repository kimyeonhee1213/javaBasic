package chap17;

public class ThrowZeroException2 {
    public static void calTest(){
        int num = 10 / 0;

        System.out.println("10/0의 결과: " +num);
    }

    public static void main(String[] args) {
        try{
            calTest();
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("처리 완료");
    }
}
