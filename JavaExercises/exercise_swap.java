package JavaExercises;
import java.util.ArrayList;
import java.util.Collections;

//SWAP EXERCISE

public class exercise_swap {
        public static void main(String[] args) {

ArrayList <String>lettersList = new ArrayList<String>();

lettersList.add("a");
lettersList.add("b");
lettersList.add("c");
lettersList.add("d");
lettersList.add("e");
lettersList.add("f");
lettersList.add("g");

System.out.println("Original List:" + lettersList);

Collections.swap(lettersList, 0, 6);

System.out.println("\nSwapped List:" + lettersList);
        
    }
}
