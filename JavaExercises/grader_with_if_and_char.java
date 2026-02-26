package JavaExercises;

public class grader_with_if_and_char {
    public static void main(String[] args) { 
        // Integer.parseInt(args[0]) allows all grades to be tested
        // Do not change this line:
        //int studentScore = Integer.parseInt(args[0]);

        int studentScore = 82;
        
        char grade;

        // Write the if / else if / else statement here:

        if (studentScore >= 90) {
            grade = 'A';
                    System.out.println(studentScore);

        } 
        else if (studentScore >= 80) {
            grade = 'B';
        } else if (studentScore >= 70) {
            grade = 'C';
        } else if (studentScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The grade is: " + grade);
        
    }
    
}

