package chap17;

public class ZeroException1 {
    public static void main(String[] args) {
        int num = 10/0;

        System.out.println("10/0 결과: " + num);
        System.out.println("처리 종료");
    }
}
