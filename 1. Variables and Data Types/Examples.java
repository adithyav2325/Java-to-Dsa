import java.util.*;

public class Examples {
    public static void main(String [] args){
        //Output
        System.out.println("OUTPUT");
        System.out.print("hello world! "); // this code is used to print the output in java
        System.out.println("Hello world!"); //this code is used to print and move on to next line or new line (println)
        System.out.print("hello world!\n"); //this code is  used to print and move on to next line or new line (\n)
        System.out.println("hello \t world");//this code is  used to prrint a tab space(\t)
        System.out.println();

        //Input
        System.out.println("INPUT");
        Scanner sc = new Scanner(System.in);
        /* 
        a fuction to take input from the users
        we have created an obj called sc to the scanner class
        */
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        System.out.println(a);

        /*
        sc.nextInt()  means to take the input in the forn of integer
        in the same way we have differnet fucntions for taking input in differnt data types
        */
        System.out.println();

        //Variables and data types
        System.out.println("VARIABLE AND DATA TYPES");
        int a1 = 10;
        /* 
        here a is a variable and int is a data type
        the value of a can change so this is called as a varibale
        but the data type is fixed.
        */ 
        float b = 42.56f;
        char c = 'd';
        long d = 45123;
        double e = 45.2697664;
        short f = 10;
        boolean g = true;
        /*
        these are the primtive data types general used most of the time
        */
        System.out.println(a1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println();

        //Type Conversion
        System.out.println("TYPE CONVERSION");
        /*
        conersion happens when:
        type is compatible and destination type > scource type
        */

        int x = 10;
        long y = x;

        /*
        long a = 10;
        int b = a;
        this would have been not possible becoz int isn't larger than long 
        */
        System.out.println(y);

        /*
        this is called as the implicit type coversion
        here float is larger than int thus this is possible
        */
        System.out.println("enter an integer to print it's float: ");
        float z = sc.nextInt();
        System.out.println(z);
        System.out.println();

        //Type casting
        System.out.println("TYPE CASTING");
        /*
        type casting means forcefully converting the data 
        from one to another type
        this is also called narrowing 
        */
        float i = 764.8746f;
        int j = (int)i;
        System.out.println(j);

        char ch = 'a';
        int k = ch;
        System.out.println(k);
        /*
        here the numbers after the decimal values will be lost
        every char has it's own unqiue number
        */
        System.out.println();
        
        //Type promotion
        System.out.println("TYPE PROMOTION");
        /*
        in java a short, char and byte are automatically 
        converted into int while evaluating expression 
        */
        char a11 = 'w';
        char b11 = 'c';
        System.out.println(a11+b11);
        /*
         here a nad b are converted to int and then operation is being carried out
         while char c = a+b
         would have been an erorr becoz a and b would have been converted to int 
         now if we add that to char, it is uncompatible 
        */

        /*
         while evaluating an expression if there is long, float or double present 
         then the final result while be in the form of these only according to 
         which one has the highest prioprity (double>long>float)
        */
        char x1 = 'a';
        int y2 = 5;
        float z3 = 84.645f;
        long p = 44485334;
        double q = 41.4847845489;
        System.out.println(x1*p+y2/z3*q);
    }
}
