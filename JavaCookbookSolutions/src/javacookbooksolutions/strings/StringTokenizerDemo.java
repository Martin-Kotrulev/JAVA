
package javacookbooksolutions.strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public final static int MAXFIELDS = 5;
    public final static String DELIM = "|";
    
    /** Processes one String and returns array of strings*/ 
    public static String[] splitStringToStringArray (String s) {
        String[] result = new String[MAXFIELDS];
        
        // Unless you ask for tokens to be returned
        // it silenty discards multiple null tokens
        StringTokenizer st = new StringTokenizer(s, DELIM, true);
        
        int i = 0;
        // insert tokens in the current slot of the array
        while (st.hasMoreTokens()) {
            String current = st.nextToken();
            if (current.equals(DELIM)) {
                if (i++ >= MAXFIELDS)
                    throw new IllegalArgumentException("Input line " + s + "has too many fields!");
                continue; // skip the delim sign
            }
            result[i] = current;
        } 
        return result;
    }
    
    static void printResult(String input, String[] outputs) {
        System.out.println("Input" + input); 
        for (int i = 0; i < outputs.length; i++)
            System.out.println("Input " + i + " was: " + outputs[i]);
    }
    
    static public void main(String[] args) {
        printResult("A|B|C|D", splitStringToStringArray("A|B|C|D"));
        printResult("A|||D", splitStringToStringArray("A|||D"));
    }
}
