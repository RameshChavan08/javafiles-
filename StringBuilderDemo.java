public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java a programming language");
        System.out.println(s1.capacity());
        System.out.println(s1.length());

        s1.append(" is powerful.");
        System.out.println(s1);

        s1.insert(2,"awesome ");
        System.out.println(s1);

        s1.delete(2,10);
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);
    }
}
