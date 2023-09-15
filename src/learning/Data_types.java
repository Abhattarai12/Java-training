package learning;

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
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " +lastName);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1+num2);




    }
}
