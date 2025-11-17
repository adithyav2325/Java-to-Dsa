**05: Functions and Methods**

**About this Module**

Functions (or "Methods" in Java) are reusable blocks of code. They let you write a piece of logic once and call it (run it) again and again from different parts of your program. This makes your code cleaner, easier to read, and easier to debug.

* * *

**1\. Syntax of a Method**

A method is defined with an access specifier (like `public`), a return type, a name, and parentheses for parameters.

`public static return_type function_name(parameter1, parameter2) {` `// body of the function` `return value;` `}`

*   **`return_type`**: The type of data the function will send back.
    
*   **`void`**: A special return type that means the function will **not** send back any value. It just performs an action (like printing to the screen).
    
*   **`int`, `boolean`, etc.** A function with these return types _must_ use the `return` keyword to send back a value of that type.
    

* * *

**2\. Parameters vs. Arguments**

*   **Parameters (Formal Parameters)**: These are the variables listed in the function's definition (e.g., `int num1, int num2`). They are placeholders.
    
*   **Arguments (Actual Parameters)**: These are the _actual values_ you pass to the function when you call it (e.g., `summation(4, 5)`).
    

* * *

**3\. Call by Value (Java's Method)**

This is a very important concept in Java.

*   When you pass an argument to a method, Java **passes a copy** of that variable's value.
    
*   This means the original variable in your `main` method is _not_ affected by what happens inside the function.
    
*   In your `callby_type` example, the `a` and `b` in `main` are swapped _inside_ the function, but the _original_ `a` and `b` in `main` remain unchanged.
    
*   **Java is always Call by Value.**
    

* * *

**4\. Function Overloading**

This is a powerful feature where you can have multiple functions with the **same name**, as long as their parameters are different.

This can be done in two ways:

1.  **By changing the number of parameters:**
    
    *   `public static void sum(int a, int b)`
        
    *   `public static void sum(int a, int b, int c)`
        
2.  **By changing the data type of parameters:**
    
    *   `public static void product(int a, int b)`
        
    *   `public static void product(float a, float b, float c)`
        

* * *

**5\. Variable Scope**

Scope defines where a variable can be accessed.

*   **Method Scope**: A variable declared inside a method is accessible anywhere _within that method_.
    
*   **Block Scope**: A variable declared inside a specific block (like a `for` loop's `int i` or an `if` statement's `{}`) is _only_ accessible within that block.
    

* * *

**6\. Inbuilt vs. User-Defined Methods**

*   **User-Defined**: These are all the methods you write yourself (e.g., `factorial()`, `isEven()`, `check_palindrome()`).
    
*   **Inbuilt**: These are pre-defined methods in Java's libraries that are ready to use. The `Math` class is a great example:
    
    *   `Math.sqrt(c)`: Finds the square root.
        
    *   `Math.min(a, b)`: Finds the minimum of two numbers.
        
    *   `Math.max(a, b)`: Finds the maximum of two numbers.
        
    *   `Math.pow(d, e)`: Calculates `d` to the power of `e`.
        
    *   `Math.abs(f)`: Finds the absolute value.
        

* * *

**What I Practiced in this Module**

*   **Function Basics**:
    
    *   Calculated the product of two numbers.
        
    *   Calculated the average of three numbers.
        
*   **Return Types**:
    
    *   Wrote a `boolean` function `isEven()` to check if a number is even.
        
    *   Wrote an `int` function `factorial()` to calculate and return a number's factorial.
        
*   **Reusability**:
    
    *   **Binomial Coefficient**: This was a key practice. I calculated `nCr` by _reusing_ the `factorial()` function three times (for `n_fact`, `r_fact`, and `nr_fact`). This shows the true power of functions.
        
*   **Logic in Functions**:
    
    *   **Prime Number Check**: Wrote a `check_prime` function and then a `check_prime_optimised` version using `Math.sqrt()` for better performance.
        
    *   **Number Manipulation**: Wrote `void` functions to check if a number is a `check_palindrome` and to calculate the `sum_of_num` (sum of its digits).
        
    *   **Number System Conversion**: Built functions to convert `BinToDec` (Binary to Decimal) and `DecToBin` (Decimal to Binary).
