package chap18;

public class LengthCharAt {
    public static void main(String[] args) {
        String str = "Java 프로그래밍";
        char ch1 = str.charAt(0);
        char ch7 = str.charAt(6);
        int len = str.length();

        System.out.println(str + "의 첫번째 문자는 " + ch1 + "입니다.");
        System.out.println(str + "의 7번째 문자는 " + ch7 + "입니다.");
        System.out.println(str + "의 문자열 길이는 " + len + "입니다.");
    }
}
