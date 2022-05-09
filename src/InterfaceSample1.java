import java.util.List;

public class InterfaceSample1 {
    interface Named{
        String name();

        default String greeting(){
            return "HI %s".formatted(name());
        }
    }

    static void msg(Named named){
        System.out.println("Hello " + named.name());
    }

    record Student(String name, int score) implements Named{}
    record Teacher(String name, String subject) implements Named{}
    record Staff(String name, String job) implements Named{}
    static class Passenger implements Named{

        @Override
        public String name() {
            return "지나감";
        }
    }
    public static void main(String[] args) {
        var people = List.of(new Student("sage",88),new Teacher("hong","Math")
        ,new Passenger() ,new Staff("길동","감독") );

        for (Named p : people){
            var n = p.name();
            var m = p.greeting();
            System.out.println("안녕하세요 %s 님".formatted(n));
            System.out.println(m);
        }

        msg(() -> "no name");
    }
}
