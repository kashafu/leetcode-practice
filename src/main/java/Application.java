import java.util.List;

public class Application {

    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] words = {"mass","as","hero","superhero"};

        List<String> result = solution.stringMatchingHashSet(words);
        System.out.println(result);
    }


}
