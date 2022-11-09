import java.util.Scanner;
/*
Your task is to write a program that takes the month of the year as an integer and outputs if it is
“Spring spawning season”, “Fall spawning season”, or “Not spawning season”. The spring spawning season
lasts from March to June (month 3 - 6). The fall spawning season
lasts from September to November (month 9 - 11).

I want you to make a new version using logical operators

&& is and
|| is or
! is not

*/

public class Salmon {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask user for month of year as an integer
        System.out.println("Enter the month of the year as a number: ");
        int month = input.nextInt();
        if(month >= 3 && month <= 6 ){
            System.out.println("Spring spawning season.");
        }
        else if (month >= 9 && month <= 11){
            System.out.println("Fall spawning season.");
        }
        else {
            System.out.println("Not spawning season.");
        }

    }
}
