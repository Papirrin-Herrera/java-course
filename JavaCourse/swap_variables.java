package JavaCourse;
public class swap_variables {
    public static void main(String[] args) {

        int myInt1 = 5;
        int myInt2 = 7;

        int temp = myInt1;
        myInt1 = myInt2;
        myInt2 = temp;

        System.out.println("Value for myInt1 = " + myInt1);
        System.out.println("Value for myInt2 = " + myInt2);
        
    }
    
}
