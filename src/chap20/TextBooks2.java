package chap20;

public class TextBooks2 extends TextBooks1{
    public void showBook(){
        super.showBook();
        System.out.println("이 책의 교과는 " + super.getSubject() + "입니다.");
    }

    public static void main(String[] args) {
        TextBooks2 t = new TextBooks2();
        t.setSubject("java 입문");
        t.showBook();
    }
}
