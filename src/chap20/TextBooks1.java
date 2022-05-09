package chap20;

public class TextBooks1 extends Books{
    private String subject;

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
        System.out.println("이 책의 교과를 " + subject + "로 했습니다.");
    }
}
