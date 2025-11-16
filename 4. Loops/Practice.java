import java.util.Scanner;

public class Practice {
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args) {
        System.out.println("PRINT FROM 1 TO 10");
        int counter = 1;
        while(counter <= 10){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("\n");

        System.out.println("PRINT FROM 1 TO n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print from 1: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        System.out.println("PRINT SUM OF FIRST n NATURAL NUMBERS");
        System.out.println("Enter a number to print its sum from 1: ");
        int n1 = sc.nextInt();
        int sum = 0;
        int j = 0;
        while(j<=n1){
            sum += j;
            j++;
        }
        System.out.println("Sum = " + sum);
        System.out.println("\n");

        System.out.println("PRINT SQUARE PATTERN (for loop)");
        for(int k = 1; k<=4; k++){
            System.out.println("****");
        }
        System.out.println("\n");

        System.out.println("PRINT REVERSE OF A NUMBER");
        System.out.println("Enter a number to reverse it: ");
        int num = sc.nextInt();
        while (num > 0){
            int last_digit = num%10;
            System.out.print(last_digit);
            num = num/10;
        }
        System.out.println("\n");

        System.out.println("REVERSE THE NUMBER");
        int num1 = sc.nextInt();
        int reverse_num1 = 0;
        while(num1>0){
            int last_digit1 = num1%10;
            reverse_num1 = (reverse_num1*10) + last_digit1;
            num1 = num1/10;
        }
        System.out.println(reverse_num1);
        System.out.println("\n");

        System.out.println("KEEP ENTERING NUMBERS UNTIL A MULTIPLE OF 10");
        while (true) { 
            System.out.println("Enter a number: ");
            int num2 = sc.nextInt();
            if (num2 % 10 == 0){
                System.out.println("Multiple of 10 isn't allowed");
                break;
            }
              
        }
        System.out.println("\n");

        System.out.println("KEEP PRINTING NUMBERS EXCEPT MULTIPLE OF 10");
        do{ 
            System.out.println("Enter a number: ");
            int num3 = sc.nextInt();
            if (num3 % 10 == 0){
                continue;
            }else{
                System.out.println(num3);
            }            
        }while(true);   
    }
}
