/* Comparing strings in Java */
public class compareSTR {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "mello";
        String str3 = "jello";

        // Using equals() method
        if (str1.equals(str2)) {
            System.out.println("Using equals(): The strings are equal.");
        } else {
            System.out.println("Using equals(): The strings are not equal.");
        }
        // Using equalsIgnoreCase() method
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Using equalsIgnoreCase(): The strings are equal.");
        } else {
            System.out.println("Using equalsIgnoreCase(): The strings are not equal.");
        }
        // Using compareTo() method
        int result = str1.compareTo(str2);
        System.out.println("Using compareTo(): " + result);
        if (str1.compareTo(str2) > 0) {
            System.out.println(str1.compareTo(str2));
            System.out.println(str1 + "\t" + str2 + "\t" + ":descending order");
        } else {
            System.out.println(str2.compareTo(str1));
            System.out.println(str1 + "\t" + str2 + "\t" + ":ascending order");
        }
        if (str3.compareTo(str1) > 0) {
            System.out.println(str3.compareTo(str1));
            System.out.println(str3 + "\t" + str1 + "\t" + ":descending order");
        } else {
            System.out.println(str1.compareTo(str3));
            System.out.println(str1 + "\t" + str3 + "\t" + ":ascending order");
        }
    }
}
