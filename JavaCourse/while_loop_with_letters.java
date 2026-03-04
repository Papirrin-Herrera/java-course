package JavaCourse;

public class while_loop_with_letters {
	public static void main(String[] args) {

        String name = "Edgar";   // Set the initial value
		
        for (int i = 0; i < name.length(); i++) {  // Condition

            char letter = name.charAt(i);
            
            System.out.println( "Character: " + letter + " at index: " + i );
        }
	}
}
