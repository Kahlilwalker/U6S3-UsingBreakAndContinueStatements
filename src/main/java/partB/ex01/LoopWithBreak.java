package partB.ex01;

import java.util.Scanner;

public class LoopWithBreak {
    public static String loopWithBreak() {
        String response = "";


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");

        double s  = myObj.nextDouble();
        double sum = 0;



        for (int i = 10; i >= 0; i++)
        while (s > 0) {
            if (s < 0) {
               break;

            }
            myObj = new Scanner(System.in);
            System.out.println("Enter number");
            sum += s;
            s = myObj.nextDouble();




        }
        System.out.println("\n" +"The sum is: "+ sum);


        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithBreak();
        System.out.print(loopOutput);
    }

}
