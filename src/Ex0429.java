import java.util.List;

public class Ex0429 {

    interface Figure{
        int width();
        int height();
    }

    record Box(int width, int height) implements Figure{}
    record Oval(int width, int height) implements Figure{}
}
//
//    public static void main(String[] args) {
//        var shape = List.of(new Box(10,15),new Oval(20,25));
//
//        for(Figure f : shape){
//            var w = f.width();
//            System.out.println("너비는 %d".formatted(w));
//            var h = f.height();
//            System.out.println("높이는 %d".formatted(h));
//
//        }
//    }