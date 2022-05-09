package chap11;

class Person05{
    String name;
    int age;

    public void showPerson(){
        String name = "홍길동";
        int age = 26;
        System.out.println("이 사람의 이름은 "+name+"이고 나이는 "+age+"입니다.");
    }
}
public class Practice0203 {
    public static void main(String[] args) {
        Person05 person = new Person05();

        person.name="이순신";
        person.age=32;

        person.showPerson();
    }
}
