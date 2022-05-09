package chap17;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[5];

            System.out.println("배열에 숫자를 할당합니다.");
            //intArray[10] = 50;
            intArray[0] = 50;
            System.out.println("배열에 50을 할당했습니다.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 요소수를 초과했습니다.");
        }finally {
            System.out.println("예외처리의 마지막 처리입니다.");
        }
        System.out.println("처리 종료");
    }
}
