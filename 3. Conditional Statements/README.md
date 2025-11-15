Here is the complete theory for your "Conditional Statements" module, formatted as plain text. You can copy and paste this directly into your Word document for your notes.

* * *

**03: Conditional Statements in Java**

**About this Module**

Conditional statements allow your program to make decisions and execute different blocks of code based on whether a condition is `true` or `false`.

* * *

**1\. The `if-else` Statement**

This is the most basic decision-making statement.

*   **`if`**: The `if` block executes _only if_ the specified condition is `true`.
    
*   **`else`**: The `else` block is optional. It executes _only if_ the `if` condition is `false`.
    

Syntax: `if (condition) {` `// code to run if condition is true` `} else {` `// code to run if condition is false` `}`

Example (from Practice.java): `if (num % 2 == 0) {` `System.out.println(num + " is even");` `} else {` `System.out.println(num + " is odd");` `}`

* * *

**2\. The `else-if` Ladder**

Used when you need to check multiple conditions in order.

*   Java checks the conditions from top to bottom.
    
*   The _first_ `if` or `else if` block whose condition is `true` is executed.
    
*   Once a block is executed, the rest of the ladder is skipped.
    
*   The final `else` block is optional and acts as a "default" case if no other condition is met.
    

Syntax: `if (condition_1) {` `// code for condition 1` `} else if (condition_2) {` `// code for condition 2` `} else {` `// code if no conditions are true` `}`

Example (from Practice.java): `if (income < 500000) {` `tax = 0;` `} else if (income >= 500000 && income < 1500000) {` `tax = (int) (0.2 * income);` `} else {` `tax = (int) (0.3 * income);` `}`

* * *

**3\. Nested `if-else`**

You can put `if-else` statements inside other `if-else` statements. This is used for more complex logic where one condition depends on another.

Example (from Assignment.java - Leap Year): `if (year % 4 == 0) {` `if (year % 100 == 0) {` `if (year % 400 == 0) {` `System.out.println("The given year is Leap year");` `} else {` `System.out.println("The given year isn't a leap year");` `}` `} else {` `System.out.println("The given year is a leap year");` `}` `} else {` `System.out.println("The given year isn't a leap year");` `}`

* * *

**4\. The Ternary Operator**

A compact, one-line shorthand for a simple `if-else` statement. It is often used to assign a value to a variable based on a condition.

Syntax: `variable = (condition) ? value_if_true : value_if_false;`

Example (from Practice.java): `String result = (marks >= 33) ? "Pass" : "Fail";` `System.out.println(result);`

This is the same as: `if (marks >= 33) {` `result = "Pass";` `} else {` `result = "Fail";` `}`

* * *

**5\. The `switch` Statement**

A `switch` statement is a cleaner alternative to a long `if-else-if` ladder when you are checking a single variable against many possible constant values.

**Traditional `switch` (with `break`)**

*   The `switch` statement evaluates an expression (e.g., `oper`).
    
*   It jumps to the `case` that matches the value.
    
*   **Crucially**, you must use the `break;` keyword to exit the `switch` block. If you forget `break`, the code will "fall through" and execute the next `case` as well.
    
*   The `default` case is optional and runs if no other `case` matches.
    

Example (from Practice.java): `switch (oper) {` `case '+':` `System.out.println(a + b);` `break;` `case '-':` `System.out.println(a - b);` `break;` `default:` `System.out.println("Invalid operation !!");` `}`

**Modern `switch` (with Arrow `->`)**

*   This is a newer, cleaner syntax introduced in modern Java.
    
*   You use an arrow (`->`) instead of a colon (`:`).
    
*   You **do not need** the `break;` keyword. It is handled automatically.
    
*   This is much safer and easier to read.
    

Example (from Assignment.java): `switch (weekday) {` `case 1 -> System.out.println("Sunday");` `case 2 -> System.out.println("Monday");` `case 3 -> System.out.println("Tuesday");` `// ...and so on` `}`

* * *

**What I Practiced in this Module**

*   **`if-else`:**
    
    *   Finding the largest of two numbers.
        
    *   Checking if a number is odd or even.
        
    *   Checking if a number is positive or negative.
        
    *   Checking if a person has a fever based on temperature.
        
*   **`if-else-if`:**
    
    *   Calculating income tax based on different slabs.
        
    *   Finding the largest of three numbers.
        
*   **Nested `if-else`:**
    
    *   Determining if a year is a leap year.
        
*   **Ternary Operator:**
    
    *   Checking if a student's marks are "Pass" or "Fail".
        
*   **`switch`:**
    
    *   Building a simple calculator (+, -, \*, /, %).
        
    *   Converting a week number (1-7) to the day's name.
        
    *   Converting a month number (1-12) to the month's abbreviation (JAN, FEB, etc.).
