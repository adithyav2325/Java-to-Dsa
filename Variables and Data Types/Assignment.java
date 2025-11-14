import java.util.*;

public class assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //average of 3 numbers
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("Average = " + avg);   
        System.out.println(); 
        
        //area of a square 
        System.out.println("Enter side of square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area = " + area);
        System.out.println();
        
        //bill with 18% gst
        System.out.println("Enter price of pencil, pen and eraser: ");
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eraser = sc.nextInt();
        float bill = (pencil*1.18f)+(pen*1.18f)+(eraser*1.18f);
        System.out.println("The bill for pencil, pen and eraser is: ");
        System.out.println(bill);
    }
}
