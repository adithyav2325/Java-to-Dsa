**02: Operators in Java**

**About this Module**

Operators are special symbols that perform operations on one or more operands (variables or values). This module covers the main categories of operators used in Java.

* * *

**1\. Arithmetic Operators**

These are used to perform common mathematical calculations.

*   **`+` (Addition)**: Adds two operands.
    
    *   `int sum = 10 + 5; // sum is 15`
        
*   **`-` (Subtraction)**: Subtracts the second operand from the first.
    
    *   `int diff = 10 - 5; // diff is 5`
        
*   **`*` (Multiplication)**: Multiplies two operands.
    
    *   `int product = 10 * 5; // product is 50`
        
*   **`/` (Division)**: Divides the first operand by the second.
    
    *   `int quotient = 10 / 5; // quotient is 2`
        
*   **`%` (Modulo / Remainder)**: Returns the remainder of a division.
    
    *   `int remainder = 10 % 3; // remainder is 1`
        

**Special Note: The `+` Operator** The `+` operator is overloaded in Java.

*   When used with two numbers, it performs arithmetic addition.
    
*   When used with one or more strings, it performs **string concatenation**.
    
    *   `String greeting = "Hello" + " " + "Java"; // greeting is "Hello Java"`
        

* * *

**2\. Unary Operators**

These operators work on only one operand.

*   **`++` (Increment)**: Increases the value of a variable by 1.
    
    *   **Post-increment (`a++`)**: Uses the _current_ value, _then_ increments.
        
    *   **Pre-increment (`++a`)**: Increments _first_, _then_ uses the _new_ value.
        
*   **`--` (Decrement)**: Decreases the value of a variable by 1.
    
    *   **Post-decrement (`a--`)**: Uses the _current_ value, _then_ decrements.
        
    *   **Pre-decrement (`--a`)**: Decrements _first_, _then_ uses the _new_ value.
        
*   **`!` (Logical NOT)**: Inverts a boolean value (true becomes false, false becomes true).
    
    *   `boolean isSunny = true;`
        
    *   `boolean isRainy = !isSunny; // isRainy is false`
        

* * *

**3\. Relational Operators**

These are used to compare two values. The result of a relational operation is always a **boolean** (`true` or `false`).

*   **`==` (Equal to)**: Checks if two values are equal.
    
    *   `10 == 5; // false`
        
*   **`!=` (Not equal to)**: Checks if two values are _not_ equal.
    
    *   `10 != 5; // true`
        
*   **`>` (Greater than)**: Checks if the left value is greater than the right.
    
    *   `10 > 5; // true`
        
*   **`<` (Less than)**: Checks if the left value is less than the right.
    
    *   `10 < 5; // false`
        
*   **`>=` (Greater than or equal to)**:
    
    *   `10 >= 10; // true`
        
*   **`<=` (Less than or equal to)**:
    
    *   `10 <= 5; // false`
        

* * *

**4\. Logical Operators**

These are used to combine multiple boolean expressions.

*   **`&&` (Logical AND)**: Returns `true` only if _both_ conditions are true.
    
    *   `(5 > 3) && (10 > 8); // true (both are true)`
        
    *   `(5 > 3) && (10 < 8); // false (one is false)`
        
*   **`||` (Logical OR)**: Returns `true` if _at least one_ condition is true.
    
    *   `(5 > 3) || (10 < 8); // true (one is true)`
        
    *   `(5 < 3) || (10 < 8); // false (both are false)`
        
*   **`!` (Logical NOT)**: Inverts the result of a boolean expression.
    
    *   `!(5 > 3); // false (because 5 > 3 is true)`
        

* * *

**5\. Assignment Operators**

These are used to assign values to variables.

*   **`=` (Simple Assignment)**: Assigns the value from the right to the variable on the left.
    
    *   `int a = 10;`
        
*   **Compound Operators (Shorthand)**: Combines an arithmetic operator with assignment.
    
    *   `a += 5;` (is shorthand for `a = a + 5;`)
        
    *   `a -= 5;` (is shorthand for `a = a - 5;`)
        
    *   `a *= 5;` (is shorthand for `a = a * 5;`)
        
    *   `a /= 5;` (is shorthand for `a = a / 5;`)
        
    *   `a %= 5;` (is shorthand for `a = a % 5;`)
        

* * *

**What I Practiced in this Module**

*   Solved a set of 5 assignment questions.
    
*   Used the `+` operator for both arithmetic and string concatenation ("Hello Java").
    
*   Wrote example programs demonstrating each category of operator (Arithmetic, Unary, Relational, Logical, and Assignment).
