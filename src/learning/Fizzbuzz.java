package learning;

import java.util.Scanner;
import java.util.Scanner;
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number:");
        int end = scanner.nextInt();
        if (end > 0) {
            for (int i = 1; i <= end; i++) {
                if (((i % 3) == 0) && ((i % 5) == 0)) {
                    System.out.println("Fizz-buzz");
                } else if ((i % 3) == 0) {
                    System.out.println("Fizz");
                } else if ((i % 5) == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                ;
            }
        } else if (end < 0){
                for (int i = 0; i >= end; i--) {
                    if (((i % -3) == 0) && ((i % -5) == 0)) {
                        System.out.println("Fizz-buzz");
                    } else if ((i % -3) == 0) {
                        System.out.println("Fizz");
                    } else if ((i % -5) == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
        }
            ;
    }
};

