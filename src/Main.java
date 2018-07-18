import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      //Q.1 The following program should allow the user to input as many things as they want until they stop.
        // Each time it is supposed to repeat with what the user said, can you fix it?
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter");
        String userInput = "";

        userInput = sca.next();
        while (!userInput.equalsIgnoreCase(""))
               userInput = sca.next();
    }
}