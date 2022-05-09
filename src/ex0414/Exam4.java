package ex0414;

import java.util.GregorianCalendar;

public class Exam4 {
    public static int count = 0;
    public static int day;

    private int x = 0;
    private int y = 0;

    //클래스 초기화 블록
    static {
        GregorianCalendar today = new GregorianCalendar();
       // day = today.get();
    }

    //인스턴스 블록
    {
        if(++count ==day){
            System.out.print("당첨!");
            System.out.printf("오늘 %d의 좌표가 생성되었습니다.\n",count);
        }
    }

    //생성자
    public Exam4(){}
    public Exam4(int x){ this.x = x;}
    public Exam4(int x, int y ){ this.x = x; this.y = y;}

    //겟터
    public int getX(){return x;}
    public int getY(){return y;}

    //식별번호
    public static int getCount(){return count;}

    public String toString(){
        return "(" + x + " , " + y + ")";
    }

}
