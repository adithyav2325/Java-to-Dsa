**01: Variables, Data Types, and I/O**

**About this Module**

This module covers the absolute fundamentals of Java. It starts with basic input/output (I/O), moves into variables and data types, and finishes with the crucial rules of how Java handles different data types interacting with each other.

* * *

**1\. Java Output**

To print to the console, we use the `System.out` object.

*   `System.out.println("Hello");`
    
    *   Prints the text and moves the cursor to a new line.
        
*   `System.out.print("Hello");`
    
    *   Prints the text and stays on the same line.
        

**Escape Sequences**

We can also use special "escape" characters inside a string:

*   `\n`: Inserts a new line. (e.g., `System.out.println("****\n***\n**\n*")`)
    
*   `\t`: Inserts a tab space.
    

* * *

**2\. Java Input (The `Scanner` Class)**

To get input from a user, we use the `Scanner` class.

**Step 1: Import the Class** At the very top of your file, you must import it: `import java.util.Scanner;` or `import java.util.*;`

**Step 2: Create a `Scanner` Object** Inside your `main` method, create an "instance" or "object" of the scanner to read from the keyboard (`System.in`): `Scanner sc = new Scanner(System.in);`

**Step 3: Use Scanner Methods to Read Data** The `Scanner` object (`sc`) has different methods to read different data types:

*   `sc.nextInt()`: Reads the next token as an `int` (integer).
    
*   `sc.nextFloat()`: Reads the next token as a `float`.
    

* * *

**3\. Variables & Primitive Data Types**

A **variable** is a named container that holds a value. That value can change. A **data type** specifies the type of value a variable can store.

**Primitive Data Types**

These are the most basic data types in Java:

*   **`int`**: Stores whole numbers (Example: `int a = 10;`)
    
*   **`float`**: Stores decimal numbers. Requires an `f` at the end. (Example: `float b = 42.56f;`)
    
*   **`char`**: Stores single characters. Uses single quotes. (Example: `char c = 'd';`)
    
*   **`long`**: Stores very large whole numbers (Example: `long d = 45123;`)
    
*   **`double`**: Stores large decimal numbers (Example: `double e = 45.2697664;`)
    
*   **`short`**: Stores small whole numbers (Example: `short f = 10;`)
    
*   **`boolean`**: Stores only `true` or `false` (Example: `boolean g = true;`)
    

**Note on Floats:** Java reads any decimal number (like `3.14`) as a `double` by default. To make it a `float`, you **must** add an `f` at the end (e.g., `3.14f`).

* * *

**4\. Type Conversion and Casting**

Java handles operations between different data types using a set of rules.

**1\. Type Conversion (Implicit / Widening)**

This is an automatic conversion that Java performs when it's safe to do so.

*   **Rule:** Conversion happens _only if_ the destination type is larger (has more precision) than the source type.
    
*   **Example:** You can safely put a small `int` into a large `long`. `int x = 10;` `long y = x; // This is a valid implicit conversion`
    
*   **Invalid:** You _cannot_ implicitly put a `long` into an `int`, as you could lose data.
    

**2\. Type Casting (Explicit / Narrowing)**

This is a **forceful** conversion from one data type to another.

*   **Warning:** You can lose data with this method. When casting a `float` to an `int`, all decimal values are lost.
    
*   **Syntax:** You "cast" by putting the new data type in parentheses `()`: `float i = 764.8746f;` `int j = (int)i; // j is now 764. The .8746f is lost.`
    
*   **Example:** You can cast a `char` to an `int` to get its unique number (ASCII/Unicode value). `char ch = 'a';` `int k = ch; // k is now 97`
    

**3\. Type Promotion in Expressions**

This is a special set of rules Java follows when evaluating expressions (e.g., `a + b`).

*   **Rule 1:** `char`, `short`, and `byte` are _always_ automatically promoted to `int` before the operation. `char a = 'w';` `char b = 'c';` `System.out.println(a + b); // Prints an integer, not 'wc'`
    
*   **Rule 2:** If an expression involves `long`, `float`, or `double`, the _entire result_ is promoted to the largest type in the expression.
    
    *   **Priority:** `double` > `long` > `float`.
        
    *   **Example:** `(char * long) + (int / float) * double` will result in a `double`.
        

* * *

**What I Practiced in this Module**

*   Printing a downward-facing triangle pattern.
    
*   Calculating the sum and product of two numbers (both hard-coded and from user input).
    
*   Calculating the area of a circle using user input for the radius (requires `float` and `Scanner`).
