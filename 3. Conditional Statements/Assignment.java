import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("QUESTION 1");
        //postive or negative number check 
        System.out.println("Enter a number to check +ve or -ve: ");
        int number = sc.nextInt();
        if (number < 0){
            System.out.println("The given number is -ve");
        } else{
            System.out.println("The given number is +ve");
        }
        System.err.println();

        System.out.println("QUESTION 2");

        //check fever
        double temperature = 103.5;
        if (temperature>= 100){
            System.out.println("You have fever");
        } else{
            System.out.println("You don't have fever");
        }
        System.out.println();

        System.out.println("QUESTION 3");

        //week number to corresponding day
        System.out.println("Enter the number of the weekday: ");
        int weekday = sc.nextInt();
        switch(weekday){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wedensday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }
        System.out.println();

        System.out.println("QUESTION 4");

        //leap year or not 
        System.out.println("Enter the year to check the leap yr or not: ");
        int year = sc.nextInt();
        if (year%4==0){
            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.println("The given year is Leap year");
                } else{
                    System.out.println("The given year isn't a leap year");
                }                
            } else{
                System.out.println("The given year is a leap year");
            }
        }  else{
            System.out.println("The given year isn't a leap year");
        }
        System.out.println();

        System.out.println("QUESTION 5");

        //new method of switch statements to find out the month with the number of the month
        System.out.println("Enter the number of the month: ");
        int month = sc.nextInt();
        switch(month){
            case 1 -> System.out.println("JAN");
            case 2 -> System.out.println("FEB");
            case 3 -> System.out.println("MAR");
            case 4 -> System.out.println("APR");
            case 5 -> System.out.println("MAY");
            case 6 -> System.out.println("JUN");
            case 7 -> System.out.println("JUL");
            case 8 -> System.out.println("AUG");
            case 9 -> System.out.println("SEPT");
            case 10 -> System.out.println("OCT");
            case 11 -> System.out.println("NOV");
            case 12 -> System.out.println("DEC");

        }
    }
}
