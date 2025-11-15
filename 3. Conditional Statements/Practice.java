import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("LARGEST OF 2");

        int x = 5;
        int y = 10;
        if (x>y){
            System.out.println(x + " is larger");
        } else {
            System.out.println(y + " is larger");
        }
        System.out.println();

        System.out.println("ODD OR EVEN");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num + " is even");
        } else{
            System.out.println(num + " is odd");
        }
        System.out.println();

        System.out.println("INCOME TAX CALCULATOR");

        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000){
            tax = 0; 
        } else if (income >= 500000 && income<1500000){
            tax = (int) (0.2 * income);
        } else {
            tax = (int)(0.3 * income);
        }
        System.out.println("Your tax is " + tax);
        System.out.println();

        System.out.println("LARGEST OF 3");

        int n1 = 54;
        int n2 = 23;
        int n3 = 82;
        
        if (n1>n2 && n1>n3){
            System.out.println(n1 + " is largest");
        } else if (n2 > n3) {
            System.out.println(n2 + " is largest");
        } else{
            System.out.println(n3 + " is largest");
        }
        System.out.println();

        System.out.println("CHECK PASS OR FAIL");

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        String result = (marks>=33)? "Pass":"Fail";
        System.out.println(result);
        System.out.println();

        System.out.println("CALCULATOR");

        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("enter another number: ");
        int b = sc.nextInt();
        System.out.println("enter the operation to be done: ");
        char oper = sc.next().charAt(0);
        switch (oper){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operation !!");
        }
    }
}
