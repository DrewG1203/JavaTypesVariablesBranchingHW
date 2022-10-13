import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int ageLimit = 21;

        System.out.println("To enter the club you must be 21. How old are you?");
        int age = Integer.parseInt(userInput.nextLine());

        if(age >= 21) {
            System.out.println("Come on in!");
        } else {
            System.out.println("You don't have to go home, but you can't stay here!");
        }
    }
}