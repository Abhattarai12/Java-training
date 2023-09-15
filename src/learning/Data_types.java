package learning;

import java.io.Console;
import java.util.Scanner;

public class Data_types {
    public static void main(String[] args) {
//        String firstName, lastName;
//        firstName = "Aarambha";
//        lastName ="Bhattarai";
//        String name = firstName + " " + lastName;
//        System.out.println(name);
//        int num1,num2;
//        num1 = 2;
//        num2 = 4;
//        System.out.println(num1+num2);
//        int result = num2/num1;
//        System.out.println(result);
//        int num3 = 5;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name :");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " +lastName);

        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The sum of the numbers you have entered is:"+ (num1 + num2));
    }
}
