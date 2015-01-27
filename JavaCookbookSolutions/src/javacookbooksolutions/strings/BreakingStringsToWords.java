
package javacookbooksolutions.strings;

import java.util.StringTokenizer;

public class BreakingStringsToWords {
    
    static void printingSimple(String s) {
        for (String word : s.split(" ")) // splitting by " " space
            System.out.println(word);
    }
    
    static void stringTokenizer(String s) {
        // second argument: tokens to look for, third: to print them or not
        StringTokenizer st = new StringTokenizer(s, ", .|!?", true);
        
        while (st.hasMoreTokens())
            System.out.println("Token: " + st.nextToken());
    }
    
    public static void main(String[] args) {
        String example = "This is. some! big| string |to... be broken? sinto words!";
        
        printingSimple(example);
        stringTokenizer(example);
    }
}
