package chap17;

public class ThrowZeroException {
    static public void calcTest(){
        int num = 10 /0;

        System.out.println("10/0 결과: " + num);
    }

    public static void main(String[] args) {
        calcTest();

        System.out.println("처리 종료");
    }
}
