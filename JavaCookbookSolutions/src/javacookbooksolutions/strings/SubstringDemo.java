
package javacookbooksolutions.strings;

public class SubstringDemo {
 
    public static void main(String[] args) {
        String a = "This is a test string!";
        System.out.println(a);
        String b = a.substring(5); // from 5th element to last
        System.out.println(b);
        String c = a.substring(5, 7); // from 5th to 7th EXclusive
        System.out.println(c);
    }
    
}
