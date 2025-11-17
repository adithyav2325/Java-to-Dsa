import java.util.Scanner;

public class Assignment {
    public static void average(int a, int b, int c){
        float avg = (a+b+c)/3;
        System.out.println("Average of given 3 numbers is - " + avg);
    }

    public static boolean isEven(int even_num){
        return even_num%2 == 0;
    }

    public static void check_palindrome(int palindrome_num){
        int new_num = 0;
        int palindrome_num1 = palindrome_num; 
        while(palindrome_num>0){
            int last_digit = palindrome_num%10;
            new_num = (new_num*10) + last_digit;
            palindrome_num = palindrome_num/10;
        }
        if(new_num == palindrome_num1){
            System.out.println("Is a palindrome");
        } else{
            System.out.println("Isn't a palindrome");
        }
    }

    public static void sum_of_num(int sum_num){
        int original_num = sum_num;
        int sum = 0;
        while(sum_num>0){
            int last_digit = sum_num%10;
            sum += last_digit;
            sum_num /= 10;
        }
        System.out.println("Sum of " + original_num + " is " + sum);
    }
    public static void main(String[] args) {
        System.out.println("QUESTION 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt(); 
        average(num1, num2, num3);
        System.out.println();

        System.out.println("QUESTION 2");
        System.out.println("Enter an even number: ");
        int even_num = sc.nextInt();
        System.out.println(isEven(even_num));
        System.out.println();

        System.out.println("QUESTION 3");
        System.out.println("Enter a number to check whether palindrome or not: ");
        int palindrome_num = sc.nextInt();
        check_palindrome(palindrome_num);
        System.out.println();

        System.out.println("QUESTION 4");
        System.out.println("Enter 2 numbers to find minimum and maximum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Minimum among these - " + Math.min(a, b));
        System.out.println("Minimum among these - " + Math.max(a, b));
        System.out.println("Enter number to find it's squrate root value: ");
        int c = sc.nextInt();
        System.out.println("Square root value = " + Math.sqrt(c));
        System.out.println("Enter base and power to find the value: ");
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("= " + Math.pow(d, e));
        System.out.println("Enter a number to get it's absolute value: ");
        int f = sc.nextInt();
        System.out.println("Absolute value = " + Math.abs(f));
        System.out.println();

        System.out.println("QUESTION 5");
        System.out.println("Enter a number to find its sum: ");
        int sum_num = sc.nextInt();
        sum_of_num(sum_num);
        System.out.println();
    }
}
