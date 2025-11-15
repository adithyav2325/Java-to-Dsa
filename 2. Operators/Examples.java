public class Examples {
    public static void main(String[] args) {
        System.out.println("ARITHEMATIC OPERATORS");
        /*
         In java there are few arithematic operators for addition , subtraction, multiplication and division
         another special operator is modulo (%) it gives the remainder
         */
        int a = 10;
        int b = 5;
        //here a and b are called as the operands and + is the operator to perform the particular operation
        System.out.println("Addition operator: " + (a+b)); 
        //(a+b) or (a-b) is being used as java doesn't allow use of + and - in the same string concatination  
        System.out.println("Subtraction operator: " + (a-b));
        System.out.println("Multiplication operator: " + a*b);
        System.out.println("Division operator: "+ a/b);
        System.out.println("Modulo (Remainder): " + a%b);
        System.out.println();

        /*
        Unary operator doesn't need more than one operand
        there are 2 types of unary operators 
        pre and post 
         */

        System.out.println("UNARY OPERATORS");

        //pre unary operator
        int c = 10;
        int d = ++c;
        /*
        here the value is updated first 
        then it is used
        */
        int e = 15;
        int f = --e;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        /*
         hence the values of original var is also changed and 
         the var assigned with the unary operator is also changed 
         */

        //post unary operator
        int n1 = 20;
        int n2 = n1++;
        /*
        here the value is used first by the second var 
        then it is being upadated
        */
        System.out.println(n1);
        System.out.println(n2);
        int n3 = 25;
        int n4 = n3--;
        System.out.println(n3);
        System.out.println(n4);
        /*
         hence the values of original var is changed and 
         the var assigned with the unary operator isn't changed 
         */
        System.out.println();

        System.out.println("RELATION OPERATORS");

        /*
         Relation operator gives us wether the relation b/w 2 or more var is true or false
        */
        int x = 10;
        int y = 25;
        //checks equal or not
        System.out.println(x==y);
        //not equal to gives the opp of equal operator
        System.out.println(x!=y);
        //checks for greater than
        System.out.println(x>y);
        //checks for lesser than
        System.out.println(x<y);
        //checks for greater than or equal to 
        System.out.println(x>=y);
        //checks for lesser than or equal to
        System.out.println(x<=y);
        System.out.println();

        System.out.println("LOGICAL OPERATORS");

        /*
         Logical operators also gives the ouptut of true or false after checking the logic
         there are 3 types in it:
         logical and, logical or, logical not
         */
        int i = 10;
        int j = 25;
        int k = 15;
        int l = 20;
        /*
        in logical and operator both the conditions must be true
        if either of the one is false then the output will be false
         */
        System.out.println((i>j) && (k>l));
        /*
        in logical or operator if any one of the operator is true
        then it will be true unless both the conditions are false
         */
        System.out.println((i>j) || (k>l));
        /*
        in logical not operator the ouptut will be opposite to the 
        correct value 
         */
        System.out.println(!(i>j));
        System.out.println();

        System.out.println("ASSGINMENT OPERATORS");

        /*
        assignment is used to assgin a value to variable to make quicker  
        changes like arithematic operation etc
         */
        // assginment operator that assigns value to var
        int num = 10;
        //here 2 is added to a  
        num += 2;
        System.out.println(num);
        //here 2 is subtracted to a
        num -= 2;
        System.out.println(num);
        //here 2 is multipled to a
        num *= 2;
        System.out.println(num);
        //here 2 is divided to a
        num /= 2;
        System.out.println(num);
        //here 2 is moduloed to a
        num %= 2;
        System.out.println(num);

        /*
        we could have done a = a+2 and etc but this way is more quciker thus 
        it is prefered to do in this manner in coding interviews
        */
    }
}
