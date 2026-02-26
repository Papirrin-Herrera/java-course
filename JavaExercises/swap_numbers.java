package JavaExercises;

public class swap_numbers {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    

    int x = 10;
    int y = 20;
    int temp = x;
    x = y;
    y = temp;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    
    }
}
