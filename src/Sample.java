import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        IntStream.range(3,1).forEach(System.out::println);
    }
}