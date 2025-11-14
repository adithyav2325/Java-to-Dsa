import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //Downwards right triangle
        System.out.println("DOWNWARD RIGHT TRIANGLE");
        //method 1 of printing the pattern in fewer lines of code using "\n"
        System.out.println("****\n***\n**\n*");
        System.out.println();
        //method 2 of printing the pattern in more number of lines using (println)
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println();

        //Sum of 2 numbers
        System.out.println("SUM OF 2 NUMBERS");
        int a = 512;
        int b = 65;
        int sum = a+b; // addition of a and b is stored in variable sum
        System.out.println("sum = " + sum);
        System.out.println();

        //Sum after input
        System.out.println("SUM OF 2 NUMBERS FROM USER");
        Scanner sc = new Scanner(System.in);
        // have taken 2 numbers as input for addition and multiplication 
        System.out.println("Enter 2 numbers for sum & product: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int summation = x+y;
        System.out.println("sum = " + summation);
        System.out.println();

        //Product
        System.out.println("PRODUCT OF 2 NUMBERS");
        int product = x*y;
        System.out.println("product = " + product);
        System.out.println();

        //Area of a cicrle
        System.out.println("AREA OF CIRCLE");
        //have taken radius as input for calculating area of the circle 
        System.out.println("Enter the radius to calculate area of circle: ");
        float rad = sc.nextFloat();
        // have added f after 3.14 becoz java reads any decimal number as double thus to convert it into float i have used f
        float area = 3.14f * rad * rad; 
        System.out.println("area = " + area);
    }
}
