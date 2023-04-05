import java.util.function.Function;

public class StringReverseLambda {
    public static void main(String[] args) {
        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
        String str = "Hello World";
        System.out.println(reverse.apply(str));
    }
}
