package strings;

public class StringExample {
    public static void main(String[] args) {
        String text = "Strings and Arrays";

        System.out.println(text.substring(3,5)); //end symbol is not included in the substring
        System.out.println(text.substring(3));

        System.out.println(text.indexOf("a"));
        System.out.println(text.lastIndexOf("a"));

        System.out.println(text.charAt(8));
        System.out.println(text.charAt(15));

        System.out.println(text.length());
    }
}
