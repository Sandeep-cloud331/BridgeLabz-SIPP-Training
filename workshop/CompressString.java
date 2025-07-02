import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        String str = "aaabbbcccdefff";
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Build the frequency map
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1); // if exists, increment count
            } else {
                map.put(ch, 1); // first time, set count to 1
            }
        }

        // Step 2: Build output string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println("Compressed output: " + result.toString());
    }
}
