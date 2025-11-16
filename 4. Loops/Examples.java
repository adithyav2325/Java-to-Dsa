public class Examples {
    public static void main(String[] args) {
        /*
         Loops are used to do the repeatative work at once
         if we need to type hello 5 times, we can use loops to print it in a
         shorter code instead of typing it 5 times

         There are 3 types:
         while, for, and do while loops
         */

        /*
         While loop
         */
        System.out.println("WHILE LOOP");
        /*
         in while loop we need to declare the counter or iterator before 
         the while syntax is used. then the condtion is used with in the paranthesis
         at last we need to increment or decrement our iterator 
         */
        int counter = 1;
        while(counter<=3){
            System.out.println("Hello world - " + counter);
            counter++;
        }
        System.out.println(); 
        /*
         always true condition will give an error becoz it 
         occupies all the memory and which isn't ideal
         */

        /*
         For loop
         */

        System.out.println("FOR LOOP");
        /*
         in for loop we'll write the code of 3 diff lines in a single line
         first the insialization of iterator then 
         condition on which the loop runs then the
         updation of the iterator 

         we can do all the stuff we did in the while loop same as it is in
         for loop also but it's our choice to which to choose
         */
        for (int i = 1; i<=3; i++){
            System.out.println("Hello world - " + i);
        }
        System.out.println();

        /*
         Do while loop
         */

        System.out.println("DO WHILE LOOP");
        /*
         do while is a unqiue one because it first executes what there in the loop
         without checking the condition
         
         we need to declare or initalize the iterator before like while
         and also update the iterator 
         but the loop will run once then the condition is checked
         */
        int j = 1;
        do { 
            System.out.println("Hello world - " + j);
            j++;
        } while (j<=3);
        System.out.println();

        
        /*
         Break statement
         */

        System.out.println("BREAK STATMENT");
        /*
         break is used to end the loop on a particular iteration
         it terminates the loop once the given iteration is reached 
         and continues the code further
         */
        for (int i = 1; i<=3; i++){
            if(i == 3){
                break;
            }
            System.out.println("Hello world - " + i);
        }
        System.out.println();

        /*
         Continue statement
         */
        System.out.println("CONTINUE STATMENT");
        /*
         continue is used to skip a particular iteration in the loop
         it skips the given iteration then after continues till the
         end of the loop
         */
        for (int i = 1; i<=3; i++){
            if(i == 2){
                continue;
            }
            System.out.println("Hello world - " + i);
        }
        System.out.println();
        

    }
}
