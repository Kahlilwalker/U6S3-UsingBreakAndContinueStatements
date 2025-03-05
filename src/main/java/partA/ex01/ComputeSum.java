package partA.ex01;

import java.util.Scanner;

public class ComputeSum {

    public static String computeSum() {
        String response = "";


        Scanner scan = new Scanner(System.in);
        int total = 0;

      int all = 0;

        int count = 10;

        for (int i = 1; i <= count; i++) {

            System.out.println("Enter integer " + i + ":");
            total = scan.nextInt();


                if (total == 0){
                    break;
                }
                else {
                    all += total;
                }

            }



        System.out.println("The sum is: " + all);
        scan.close();







        return response;
    }

    public static void main(String[] args) {
        String sum = computeSum();
        System.out.print(sum);
    }




    }

