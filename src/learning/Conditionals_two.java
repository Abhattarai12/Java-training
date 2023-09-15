package learning;
import java.util.Scanner;

public class Conditionals_two {
    public static void main(String[] args) {
//        int x = 10;
//        while (x>0) {
//            System.out.println(x--);
//        }
//        System.out.println("We have Lift off!");
//        int x = 5;
//        while (x < 10) {
//            System.out.println("x is " + x);
//            x++;
//        }
//        int sum =0 ;
//        for (int i =0; i<10; sum += i++){
//            System.out.println("Sum is " + sum);
//        }
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter a second number: ");
//        int num2 = scanner.nextInt();
//        System.out.println("The largest number of the two numbers is " + Math.max(num1,num2));
//        System.out.println("Enter another number:");
//        int num3 = scanner.nextInt();
//        if (num3%2 == 0) {
//            System.out.println("Your number is even");
//        } else {
//            System.out.println("Your number is odd");
//        };
//        System.out.println("Give me a traffic light colour :");
//        String traffic = scanner.nextLine();
//        switch(traffic) {
//            case "Green":
//                System.out.println("Green means go");
//                break;
//            case "Yellow":
//                System.out.println("Yellow means slow down");
//                break;
//            case "Orange":
//                System.out.println("Orange means slow down!");
//                break;
//            case "Red":
//                System.out.println("Red means stop!");
//        };
//        System.out.println("Enter a number between 1 to 12");
//        int num4 = scanner.nextInt();
//        switch(num4) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("Your number was not between 1 and 12");
//        }
        System.out.println("Enter a number: ");
        int num5 = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int num6 = scanner.nextInt();
        System.out.println("Enter an operator ( + , - , * or / )");
        String calc = scanner.next();
        switch(calc){
                    case "+":
                        System.out.println("The result is "+ (num5+num6));
                        break;
                    case "-":
                        System.out.println("The result is "+ (num5-num6));
                        break;
                    case "*":
                        System.out.println("The result is "+ (num5*num6));
                        break;
                    case "/":
                        System.out.println("The result is "+ (num5/num6));
                        break;
                    default:
                        System.out.println("That was not a valid operator");
            }

    }

    ;
}
