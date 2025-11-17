public class Examples {
    
    public static void demo_function(){
        /*
         Funntion is the resuable block of code that
         can be called again and again for the use of a 
         particular usages. 
         
         firstly we need to mention the access specifier then after
         the return type of the fucntion then the name of the function
         then the paranthesis for the parameters
         the operations and code to be in the flower bracket then at the 
         end we need to mention the return statement

         return type is imp, void doesn't return any kind of return 
         but other than that all of the other return types do return the 
         same data type in the return statement or else it will throw an error
         */
        System.out.println("Hello world 1");
        System.out.println("Hello world 2");
        System.out.println("Hello world 3");
    }
    
    public static int summation (int num1, int num2){
        /*
         parameters are writen with the type of data they are passed to the function
         they are also called as formal parameters which is writen during function defination

         since the return type is int we need to return a value that is int itself
         */
        int sum = num1 + num2;
        System.out.println("The sum of 2 numbers is - " + sum);
        return sum;

        /*
         we can store the return of the function in a variable or else we can also print the 
         value directly after the whole operations are done
         */
    }

    public static void callby_type(int a, int b){
        /*
         call by value is where we use value to call the function is java
         here the 2 variable a and b are just known to the function "callby_type"
         we can use the name variable name a and b in the main fucntion as these are limited
         to only this function
         */
            int swap = a;
            a = b;
            b = swap;
            System.out.println(a);
            System.out.println(b);
        /*
         java works on the call by value only, call by refrence is where we pass the orginal value 
         itself to the function
         */

        }

        /*
         Function overloading is method where in we can use the same of a function for a different 
         function as well but the type or no of parameters should be diff
         */
        /*
         Function overloading using parameter diff
         */
        public static void sum(int a, int b){
            int c = a+b;
            System.out.println(c);
        }

        public static void sum(int a, int b, int c){
            int d = a+b+c;
            System.out.println(d);
        }

        public static void  sum(int a, int b, int c, int d){
            int e = a+b+c+d;
            System.out.println(e);
        }

        /*
         Function overloading using type diff
         */
        public static void product(int a, int b){
            int c = a*b;
            System.out.println(c);
        }

        public static void product(float a, float  b, float c){
            float d = a*b*c;
            System.out.println(d);
        }

        public static void  product(double a, double b, double c, double d){
            double e = a*b*c*d;
            System.out.println(e);
        }

        /*
         scope is a concept where we get to know about the range of a variable where it
         can be used

         in method scope we can use the declared variable inside the method where ever we can

         in block scope we can use the declared variable inside the given {} only

         if we try to use it other wise then we'll recieve an error
         one of the best example is for loop
         */

    public static void main(String[] args) {
        System.out.println("FUNTIONS AND METHODS");
        demo_function();
        System.out.println();
        /*
         here the 2 numbers are called as the arguments or actual parameters that are writen during 
         the function call
         */
        System.out.println("PARAMETERS");
        summation(4, 5);
        int alpha = summation(4, 5);
        System.out.println(alpha);
        System.out.println();
        
        /*
         an imp thing to be noticed is that the memory works in the form of call stack
         once then function is called it occupies the space in the memory on over the other, later
         after the function returns the memeory gets cleared one by one from the top of the stack
         */
        System.out.println("CALL BY VALUE OR REFRENCE");
        int a = 10;
        int b = 12;
        callby_type(a,b);
        System.out.println();
        /*
         if we call the function by the value then the original value isn't passed but the 
         copy of it is passed to the functions parameters
         */

        /*
         methods are the fuctions which are written inside a class
         in java everything is a method as everything is based on OOPS
         */

        /*
         inbuilt functions are those which are perdefined and ready to use
         where as user defines functions are those which are defined acc to the need of the 
         programmer
         */

        /*
         function overloading by diff in parameters
         */
        System.out.println("FUNCTION OVERLAODING BY DIFFERENT PARAMETERS");
        sum(5, 4);
        sum(5, 4, 8);
        sum(5, 4, 8, 2);
        System.out.println();
        
        /*
         function overloading by diff in data type 
         */
        System.out.println("FUNCTION OVERLAODING BY DIFFERENT DATA TYPE OF PARAMETERS");
        product(5, 4);
        product(5.568f, 4.48f, 8.647f);
        product(5.64846545, 4.655451585, 8.6841849651886, 2.5451484865132);        
    }    
}
