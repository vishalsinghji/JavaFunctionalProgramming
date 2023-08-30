import java.util.HashMap;
import java.util.Map;

public class test {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomFreq = new HashMap<>();
        Map<Character, Integer> magazineFreq = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            ransomFreq.put(c, ransomFreq.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            magazineFreq.put(c, magazineFreq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : ransomFreq.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();
            if (count > magazineFreq.getOrDefault(letter, 0)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){
        System.out.println(canConstruct("aa","aab"));
//        System.out.println(canConstruct("aa","ab"));
//        System.out.println(canConstruct("aa","aab"));

    }

}


