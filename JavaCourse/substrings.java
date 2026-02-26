package JavaCourse;
public class substrings {
    public static void main(String[] args) {
        
        // Define a string to work with
        String myString = "Hello World!";
        
        // Print the original string
        System.out.println("Original string: " + myString);
        
        // Accessing single characters
        System.out.println("Character at position 8: " + myString.charAt(8));  // Outputs 'r'

        // Length of the string
        System.out.println("Length of string: " + myString.length());  // Outputs '12'

        // Using substring to get a part of the string
        System.out.println("Substring from index 3: " + myString.substring(3));  // Outputs "lo World!"
        System.out.println("Substring from index 3 to 8: " + myString.substring(3, 8));  // Outputs "lo Wo"

        // Demonstrating how to handle the last character
        System.out.println("Last character: " + myString.charAt(myString.length() - 1));  // Outputs '!'
        
        // More examples with other strings
        String myString2 = "hello";
        String myString3 = "3.141592";
        String myString4 = "!@#$%^&*()_=+{}\\|,;<,>.?/";

        // Print examples of substrings from other strings
        System.out.println("Substring of myString2 from index 1 to 4: " + myString2.substring(1, 4));  // Outputs "ell"
        System.out.println("Substring of myString3 up to index 4: " + myString3.substring(0, 4));  // Outputs "3.14"
        System.out.println("Substring of myString4: " + myString4.substring(10, 15));  // Outputs "_=+{}"

        // Creating a new string from a substring
        String newString = myString.substring(6, 11);
        System.out.println("New string from myString: " + newString);  // Outputs "World"
        
        // Creating new example with my Name Edgar Herrera
        String myName = "Edgar Herrera";
        System.out.println("Original String with my Name: " + myName);

        // Accessing single characters with Char
        System.out.println("Character at position 6: " + myName.charAt(6)); // Output "H"

        // Length of the string with Lenght
        System.out.println("Length of string: " + myName.length()); // Outputs 13

        // Using substring to get a part of the string
        // Con esta funcion se trae el numero de digitos de la cadena establecida
        System.out.println("Substring from index 4:" + myName.substring(3)); // Output "ar Herrera"
        System.out.println("Substring from index 4 to 9:" + myName.substring(3, 9)); // Output "ar Her"

        // Demonstrating how to handle the last character
        System.out.println("Last character: " + myName.charAt(myName.length() - 1)); // Output "a"

        // Creating a new string from a substring
        String newString2 = myName.substring(6, 13);
        System.out.println("New string from myString2: " + newString2); // Outputs "Herrera"

        // New example from a text
        String myText = "Hello, How are you?";

        // Using substring to get a part of the string
        System.out.println("Substring Example from a text: " + myText.substring(7, 10)); // Output How

        // Demonstrating how to handle a substring from a new String
        String newString3 = myText.substring(7, 10);
        System.out.println("Get a substring from a new String: " + newString3); // Output "How"

        // Accessing single characters with Char
        System.out.println("Get a single character: " + myText.charAt(15)); // Output "y"

        // Validating to get the last character from the text with chart and lenght
        System.out.println("last character from the text: " + myText.charAt(myText.length() -1)); // Output "?"

        // Accessing single characters with new Char
        char newChar = myText.charAt(11);
        System.out.println("Take one character from the Text: " + newChar); // Output "a"

        // Demonstrating how to handle the last character with new Char
        char newChar2 = myText.charAt(myText.length() - 1);
        System.out.println("last character from the text: " + newChar2);// Output "?"

    }
}
