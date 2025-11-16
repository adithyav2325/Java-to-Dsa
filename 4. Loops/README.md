**04: Loops in Java**

**About this Module**

Loops are used to execute a block of code repeatedly as long as a certain condition is true. This is essential for repetitive tasks, like printing "Hello" 5 times or processing a set of numbers.

* * *

**1\. Types of Loops**

There are three main types of loops in Java:

**1\. The `while` Loop**

*   **Initialization:** The iterator (counter) must be declared _before_ the loop starts.
    
*   **Condition:** The loop continues to run _while_ the condition in the parentheses `()` is true. The condition is checked _before_ each iteration.
    
*   **Updation:** The iterator must be incremented or decremented _inside_ the loop body.
    

Syntax: `int i = 1;` `while (i <= 3) {` `System.out.println("Hello world - " + i);` `i++;` `}`

**2\. The `for` Loop**

*   This loop is more compact and combines initialization, condition, and updation all in one line. It's often chosen when you know exactly how many times you want to loop.
    

Syntax: `for (int i = 1; i <= 3; i++) {` `System.out.println("Hello world - " + i);` `}`

**3\. The `do-while` Loop**

*   This is a unique "exit-controlled" loop.
    
*   **Key Feature:** The `do-while` loop _always_ executes the code block at least once, _before_ it checks the condition for the first time.
    
*   The condition is checked at the _end_ of the iteration.
    

Syntax: `int j = 1;` `do {` `System.out.println("Hello world - " + j);` `j++;` `} while (j <= 3);`

* * *

**2\. Loop Control Statements**

These statements change the normal flow of a loop.

**1\. The `break` Statement**

*   **Use:** To **terminate** the loop immediately.
    
*   When `break` is encountered, the program exits the loop entirely and continues with the next line of code _after_ the loop.
    
*   **Example:** "Keep entering numbers until a multiple of 10 is entered." `while (true) {` `int num = sc.nextInt();` `if (num % 10 == 0) {` `break; // Exits the infinite loop` `}` `}`
    

**2\. The `continue` Statement**

*   **Use:** To **skip** the current iteration.
    
*   When `continue` is encountered, the loop skips all the code _after_ it in the current iteration and jumps straight to the next iteration (and re-checks the condition).
    
*   **Example:** "Print all numbers except multiples of 10." `for (int i = 1; i <= 10; i++) {` `if (i % 10 == 0) {` `continue; // Skips this iteration` `}` `System.out.println(i); // This line is skipped when i is 10` `}`
    

* * *

**What I Practiced in this Module**

*   **`while` Loop Basics:**
    
    *   Printed numbers from 1 to 10.
        
    *   Printed numbers from 1 to `n` (user input).
        
    *   Calculated the sum of the first `n` natural numbers.
        
    *   Calculated the factorial of a given number.
        
    *   Printed the multiplication table for a given number.
        
*   **`for` Loop Basics:**
    
    *   Printed a 4x4 square pattern (`****`).
        
*   **Logic & `while` Loops:**
    
    *   Printed the reverse of a number (e.g., 123 -> 321).
        
    *   Stored the reverse of a number as a new integer.
        
*   **Loop Control (break/continue):**
    
    *   Used `break` to exit an infinite loop when a user enters a multiple of 10.
        
    *   Used `continue` to skip iterations where the user entered a multiple of 10.
        
*   **Combined Logic (for/if):**
    
    *   **Prime Number Check:** Checked if a number is prime using an optimized `for` loop that only runs up to the square root of the number (`Math.sqrt(num)`).
        
    *   Checked a set of numbers to determine if each was "Odd" or "Even".
