package JavaExercises;
/**
 * Let's play with strings
 *
 * EXPLANATION:
 *
 * 1) The coding exercise consist on discarding elements within a list depending on:
 *      - Element length
 *      - Element's first letter
 *      - Sorting the new filtered list
 *
 * 2) Output MUST be similar to example below
 *
 * 3) You cannot erase anything that's already part of the exercise (main class, main method)
 *
 * 4) No restrictions on the amount/names of private methods you can create within the class, as long as names are descriptive or JDoc is included
 *
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise_filterAndSort {

/**
     * Main, executable method
     * THIS METHOD SHOULD PRINT ALL EXPECTED OUTPUT
     * @param   args
     */

public static void main(String args[]) {
        String[] testStrings = { "Bernard", "Charlie", "Angie", "Andy", "Bertha", "Annie", "Carl", "Dennis", "Caroline", "Bob", "Betty", "Bart", "Albert", "Connie", "Ale"};
        System.out.println("Let's begin...");

        List<String> names = Arrays.asList(testStrings);

        System.out.println("Original collection: " + names);

        System.out.println(
                "Sorted & filtered names with A larger than 4 characters: " +
                filterAndSort(names, 'A', 4)
        );

        System.out.println(
                "Sorted & filtered names with B equal or larger than 3 characters: " +
                filterAndSort(names, 'B', 3)
        );

        System.out.println(
                "Sorted & filtered names with C equal or larger than 5 characters: " +
                filterAndSort(names, 'C', 5)
        );
}

    // YOU CAN ADD MORE PRIVATE METHODS HERE, IF NEEDED!

private static List<String> filterAndSort(List<String> names, char initial, int minLength) {
        return names.stream()
                .filter(name -> name.startsWith(String.valueOf(initial)))
                .filter(name -> name.length() >= minLength)
                .sorted()
                .collect(Collectors.toList());
}
}

/**
 * EXPECTED OUTPUT WHEN MAIN IS EXECUTED:
 * ======================================
 * Original collection: [Bernard, Charlie, Angie, Andy, Bertha, Annie, Carl, Connie, Caroline, Bob, Betty, Bart, Albert]
 * Sorted & filtered names with A larger than 4 characters: [Albert, Angie, Annie, Andy]
 * Sorted & filtered names with B equal or larger than 3 characters: [Bart, Bernard, Bertha, Betty, Bob]
 * Sorted & filtered names with C equal or larger than 5 characters: [Caroline, Charlie, Connie]
 */



