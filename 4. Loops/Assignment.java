import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("QUESTION 1");
        //Odd or even in a set of numbers
        System.out.println("Enter the number of nos in the set: ");
        int num = sc.nextInt();
        int i = 1;
        while(i<=num){
            int num1 = sc.nextInt();
            if(num1%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
            i++;
        } 
        System.out.println();
        
        System.out.println("QUESTION 2");
        //factorial of a given number
        System.out.println("Enter the number to find it's factorial: ");
        int fact = sc.nextInt();
        int j = 1;
        int factorial = 1;
        while(j<=fact){
            factorial *= j;
            j++;
        }
        System.out.println("Factorial of the given number is = " + factorial); 
        System.out.println();


        System.out.println("QUESTION 3");
        // Multpilication of a given number
        System.out.println("Enter a number to get it's multi table: ");
        int multi_num = sc.nextInt();
        int table;
        int k = 1;
        while(k<=10){
            table = multi_num * k;
            System.out.println(table);
            k++;
        }
        System.out.println();
        // prime or not
        System.out.println("QUESTION 4");
        System.out.println("CHECK PRIME OR NOT");
        System.out.println("Enter number to check prime or not: ");
        int check_prime = sc.nextInt();
        if (check_prime==2){
            System.out.println(check_prime + " is a prime number");
        } else{
            boolean is_prime = true;
            for (int z = 2; z <= Math.sqrt(check_prime); z++){
                if (check_prime % z == 0){
                    is_prime = false;
                }
            }

            if (is_prime == true){
                System.out.println(check_prime + " is a prime number");
            }else{
                System.out.println(check_prime + " isn't a prime number");
            }
        }
    }
}
