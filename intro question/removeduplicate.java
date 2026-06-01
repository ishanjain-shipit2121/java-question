import java.util.*;

public class removeduplicate {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        
        // Base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        // If character already seen
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // Mark as seen
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String args[]) {
        String str = "appnacollage";
        boolean map[] = new boolean[26];

        removeDuplicates(str, 0, new StringBuilder(""), map);
    }
}