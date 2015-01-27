
package javacookbooksolutions.strings;


public class StringBuilderDemo {
    public static void main(String[] args) {
        // Build a stringbuilder and append some strings to it
        StringBuilder sb = new StringBuilder();
        sb.append("First part");
        sb.append(" ");
        sb.append("Second part");
        
        // get the stringbuilder value and print it
        String sbResult = sb.toString();
        System.out.println(sbResult);
        
        // another declaration and execution
        System.out.println(new StringBuilder()
                                .append("first part")
                                .append(" ")
                                .append("second part"));
    }
}
