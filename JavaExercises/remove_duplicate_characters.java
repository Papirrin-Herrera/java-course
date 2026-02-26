package JavaExercises;

import java.util.LinkedHashSet;

public class remove_duplicate_characters {
    public static void main(String[] args) {
        String str = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()){
            set.add(ch);
        }

        for (char ch : set){
            System.out.println(ch);
        }
    }
}
