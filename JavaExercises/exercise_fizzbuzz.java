package JavaExercises;
import java.io.*;

class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
    
    for(int i=1; i<=n; i++) {
            
            //match with 3 and 5
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            
            //match with 3
            if(i % 3 == 0 && !(i % 5 == 0)) {
                System.out.println("Fizz");
            }
            
            //match with 5
            if(!(i % 3 == 0) && i % 5 == 0) {
                System.out.println("Buzz");
            }
            
            //match with 3 and 5
            if(!(i % 3 == 0) && !(i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}

public class exercise_fizzbuzz {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            
            Result.fizzBuzz(n);
        }
    }
}
