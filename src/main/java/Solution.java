import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public List<String> stringMatchingHashSet(String[] words) {
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i<words.length-1; i++) {
            String currWord = words[i];
            for(int j = i+1; j<words.length; j++) {
                String nextWord = words[j];

                if(currWord.contains(nextWord)) {
                    set.add(nextWord);
                }

                if(nextWord.contains(currWord)) {
                    set.add(currWord);
                }
            }
        }

        return new ArrayList<String>(set);
    }
}
