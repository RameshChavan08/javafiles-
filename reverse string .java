import java.util.function.Function;

public class reverseString {
    public static void main(String[] args) {
        String input = "reverse";
        System.out.println("Input: " + input);

        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
        String output = reverseString.apply(input);
        System.out.println("Output: " + output);
    }
}






