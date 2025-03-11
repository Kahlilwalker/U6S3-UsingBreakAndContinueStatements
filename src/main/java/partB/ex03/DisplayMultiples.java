package partB.ex03;

import java.util.Scanner;

public class DisplayMultiples {
    public static String displayWithMultiples() {
        String response = "";

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");

        double s  = myObj.nextDouble();
        double sum = 0;

        for( int i = 1 ; i < 50; i++ ) {

            if( i % s != 0 ) {
                continue;

            }

            response += (+ i +"\n" );

            if( i > 50 ) {
                break;
            }

        }
        return response;
    }

    public static void main(String[] args) {
        String displayOutput = displayWithMultiples();
        System.out.print(displayOutput);
    }
}
