package interview;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewTasks {

    public static void main(String [] args) {
        System.out.println("test");
    }

    /**
     * optimal way using streams to sum list of numbers using mapToInt
     * @param numbers
     * @return
     */
    public int evenSum(Set<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 0).mapToInt(number -> number).sum();
    }

    /**
     * optimal way using streams
     * @param numbers
     * @return
     */
    public int evenSumUsingReduces(Set<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 ==0).reduce(0, (a, b) -> a+b);
    }

    /**
     * optimal way using streams
     * @param numbers
     * @return
     */
    public int evenSumUsingSummingInt(Set<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 ==0).collect(Collectors.summingInt(Integer::intValue));
    }

/*    Implement a method that will count vowels in a given sentence
    and print them ordered by number of occurrences (together with the number of occurrences).
    "Engineer" ->  i=1, e=3,
    "Java Developer" -> o=1, a=2 e=3*/

    /**
     * Calculate number of Vowels in sentence
     * @param sentence
     * @return
     */
    public Map<String, Integer> countVowels(String sentence) {

        List<String> vowels = initVowels();

        Map<String, Integer> counter = new HashMap<>();

        for(int i=0; i <= sentence.length(); i++) {
            char letter = sentence.charAt(i);
            String letterStr = Character.toString(letter);

            boolean contains = vowels.contains(letterStr);
            if(contains) {
                if(counter.containsKey(letterStr)) {
                    int amount = counter.get(letterStr);
                    counter.put(letterStr, amount+1);
                } else {
                    counter.put(letterStr, 1);
                }
            }
        }

        return counter;
    }

    private List<String> initVowels() {
        List<String> vowels = new ArrayList<>();
        vowels.add("i");
        vowels.add("e");
        vowels.add("o");
        vowels.add("a");
        vowels.add("e");
        return vowels;
    }
}
