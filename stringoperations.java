public class stringoperations {
    public static void main(String[] args) {

        String str = "Java Programming";
        String str2 = "java programming";

        int length = str.length();

        char ch = str.charAt(2);

        String sub = str.substring(5, 16);

        boolean isEqual = str.equals(str2);

        boolean isEqualIgnore = str.equalsIgnoreCase(str2);

        String upper = str.toUpperCase();

        String lower = str.toLowerCase();

        int index = str.indexOf("Program");

        String replaced = str.replace("Java", "Core Java");

        boolean contains = str.contains("Java");

        System.out.println(length);
        System.out.println(ch);
        System.out.println(sub);
        System.out.println(isEqual);
        System.out.println(isEqualIgnore);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(index);
        System.out.println(replaced);
        System.out.println(contains);
    }
}
