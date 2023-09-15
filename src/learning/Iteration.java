package learning;

public class Iteration {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            if (i == 0) {
//                System.out.println("You are on the first loop");
//            } else if (i == 1) {
//                System.out.println("You are on the second loop");
//            } else if (i == 2) {
//                System.out.println("You are on the third loop");
//            } else {
//                System.out.println("You are on the " + (i+1) + "th loop");
//            }
//            ;
//        }
//        ;
//        int i = 0;
//            do {
//                System.out.println(" i =" + i);
//                i++;
//            }
//        while (i < 10){
//            System.out.println("i = "+ i);
//            i++;
//        };

        // Second task
//            int i = 0;
//            int j = 10;
//            do {
//                System.out.println(" i = "+i);
//                System.out.println(" j = "+j);
//                i++;
//                j--;
//            } while ( i < j);

        // Third task
            int sum = 0;
            int i = 0;
            do {
                sum += i;
                i++;
                System.out.println("The sum is : "+ sum);
            } while (i<10);
      };
};

