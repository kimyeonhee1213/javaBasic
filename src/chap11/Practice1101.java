package chap11;

class Person02{
    String name;
    int age;

    public void showPerson(){
        System.out.println("이 사람의 이름은 "+ this.name+"이고, 나이는 "+this.age+
                "살입니다.");
    }
}

public class Practice1101 {
    public static void main(String[] args) {
        Person02 person1 = new Person02();
        Person02 person2 = new Person02();

        person1.name = "홍길동";
        person1.age = 20;

        person2.name = "김연희";
        person2.age = 24;

        person1.showPerson();
        person2.showPerson();
    }
}
