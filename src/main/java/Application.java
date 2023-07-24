import java.util.List;

public class Application {

    public static void main(String[] args) {

        String[] words = {"mass","as","hero","superhero"};

        Solution solution = new Solution();
        List<String> result = solution.stringMatchingHashSet(words);
        System.out.println(result);
    }


}
