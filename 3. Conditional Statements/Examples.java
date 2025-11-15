public class Examples {
    public static void main(String[] args) {
        System.out.println("IF - ELSE STATMENT");
        /*
         if - else is one of the conditional stamtents
         we'll provide a condition, if that's true then 
         the following instructions are followed other wise
         the block of code in else will be exicuted 
         */
        int a = 3;
        int b = 5;

        // here given condition is false thus the code block of else exicuties 
        if (a>b) 
        {
            System.out.println("the given condition is true");
        } 
        else 
        {
            System.out.println("the given condition is flase");
        }
        System.out.println();

        System.out.println("ELSE - IF STATEMENT");

        /*
        We use else - if instead of multiple if statements
        it is exicuted faster in comparision to multiple if statements 
         */
        int age = 22;
        /*
        since the age is above 22, the complier only checks if condition
        as it is true it exicutes and code ends
         */
        if (age >=18){
            System.out.println("adult");
        } 
        /*
         if it was another if here instead of else if then
         complier would have checked every statement
         this slowers the exicution 
         */
        else if(age >= 13 && age <18)
        {
            System.out.println("teenager");
        }
        else
        {
            System.out.println("Child");
        }
        System.out.println();

        System.out.println("TERNORY STATEMENTS");

        /*
        another form of writing if else statement in short form
        instead of multiple lines we can write it in single line
         */

         /*
        the condition has a qus mark which checks the condition 
        then if true it assgins left part of colan to var or if false then
        it assgins right part of the colon to var
          */

        String alpha = (1452 > 324)? "True":"False";
        System.out.println(alpha);
        System.out.println();

        System.out.println("SWITCH STATEMENTS");

        /*
         *switch is also a rare conditional statement used
         we need to give a var as condition
         then it goes through multiple cases and exictues
         the corresponding case
         */
        int var = 1;
        switch (var) {
            case 1:
            System.out.println("burger");
                break; //break is used becoz if a case is true then all cases below it also executes 
            case 2:
            System.out.println("pizza");
                break;
            case 3:
            System.out.println("pasta");
                break;
            default:
                System.out.println("nothing is provided");
        }
    }
}
