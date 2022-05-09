package chap17;

public class ArrayException {
    public static void main(String[] args) {
        try{
            int[] intArray = new int [5];
            intArray[9] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스값을 넘어갔습니다.");
        }
        System.out.println("프로그램 종료");
    }
}
