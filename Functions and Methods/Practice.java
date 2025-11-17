import java.util.*;

public class Practice {
    public static void product (int a, int b){
        int multiple = a * b;
        System.out.println("product of given numbers is - " + multiple);
    }

    public static int factorial (int fact){
        int counter = 1;
        int factorial_of_fact = 1;
        while(counter<=fact){
            factorial_of_fact *= counter; 
            counter++;
        }
        return factorial_of_fact;
    }

    public static boolean check_prime(int num){
        if (num == 2){
            return true;
        }

        for(int i = 2; i<= num - 1; i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean check_prime_optimised(int num){
        if (num == 2){
            return true;
        }

        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }

    public static void BinToDec (int bin_num){
        int my_dec = bin_num;
        int dec_num = 0;
        int power = 0;
        while(bin_num>0){
            int last_digit =bin_num%10;
            dec_num = dec_num + (last_digit*(int)Math.pow(2, power));
            power++;
            bin_num = bin_num/10;
        }
        System.out.println("Decimal of " + my_dec + " is " + dec_num);
    }

    public static void DecToBin (int dec_num){
        int my_bin = dec_num;
        int bin_num = 0;
        int power = 0;
        while(dec_num>0){
            int remainder = dec_num%2;
            bin_num = bin_num + (remainder*(int)Math.pow(10, power));
            power++;
            dec_num = dec_num/2;
        }
        System.out.println("Binary of " + my_bin + " is " + bin_num);
    }

    public static void main(String[] args) {
        System.out.println("PRODUCT OF 2 NUMBERS");
        product(50, 20);   
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("FACTORIAL OF GIVEN NUMBER");
        System.out.println("Enter the number for the factorial: ");
        int fact = sc.nextInt();
        int result = factorial(fact);   
        System.out.println("factorial of the number is - " + result);
        System.out.println();
        
        System.out.println("BINOMIAL COFFICENT");
        System.out.println("Enter the n to calculate binomial cofficent");
        int n = sc.nextInt();
        System.out.println("Enter the r to calculate binomial cofficent");
        int r = sc.nextInt();
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);
        float bino_coffe = n_fact/(r_fact*nr_fact);
        System.out.println("Binomial coffecient of given data is - " + bino_coffe);
        System.out.println();

        System.out.println("");
        System.out.println("PRIME NUMBER OR NOT PRIME NUMBER");
        Boolean prime = check_prime(5);
        if (prime){
            System.out.println("is a prime");
        } else{
            System.out.println("is not a prime");
        }
        System.out.println();

        System.out.println("PRIME NUMBER OR NOT PRIME NUMBER IN OPTIMISED WAY");
        Boolean prime1 = check_prime_optimised(18);
        if (prime1){
            System.out.println("is a prime");
        } else{
            System.out.println("is not a prime");
        }
        System.out.println();

        System.out.println("FIND PRIME NUMBERS IN THE GIVEN RANGE");
        System.out.println("Enter a number to find the prime in that range from 2: ");
        int user_num = sc.nextInt();
        for (int i = 2; i<=user_num; i++){
            if(check_prime_optimised(i)){
                System.out.println(i + " is a Prime number");
            } 
        }
        System.out.println();

        System.out.println("BINARY TO DECIMAL CONVERSION");
        System.out.println("Enter the binary number to convert to decimal: ");
        int bin_num = sc.nextInt();
        BinToDec(bin_num);
        System.out.println();

        System.out.println("DECIMAL TO BINARY CONVERSION");
        System.out.println("Enter the binary number to convert to decimal: ");
        int dec_num = sc.nextInt();
        DecToBin(dec_num);
        System.out.println();

    }
}
