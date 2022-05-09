package chap18;

import java.util.ArrayList;

public class UseArray2 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();

        strList.add("Good morning");
        System.out.println("1번째 저장 데이터는 " + strList.get(0) + "입니다.");

        strList.add("Hello");
        System.out.println("2번째 저장 데이터는 " + strList.get(1)+"입니다.");

        strList.add("Bye");
        System.out.println("3번째 저장 데이터는 " + strList.get(2) + "입니다");
    }
}
