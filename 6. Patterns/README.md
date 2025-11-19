**06: Patterns**

**About this Module**

Nested loops are "loops inside loops." They are essential for dealing with multi-dimensional data (like grids or matrices) and for printing complex 2D patterns.

* * *

**1\. Understanding Nested Loops**

*   A nested loop consists of an **Outer Loop** and an **Inner Loop**.
    
*   The **Outer Loop** controls the _rows_ (vertical lines).
    
*   The **Inner Loop** controls the _columns_ (horizontal contents).
    
*   **Key Logic:** For _every single iteration_ of the outer loop, the inner loop runs to completion (from start to finish).
    

**Example Logic (Square Pattern):** `for (int line = 1; line <= n; line++) { // Outer Loop (Rows)` `for (int star = 1; star <= n; star++) { // Inner Loop (Columns)` `System.out.print("*");` `}` `System.out.println(); // Move to next line after printing one row` `}`

* * *

**2\. Basic Patterns**

I practiced building several fundamental patterns to master this logic.

*   **Star Pattern (Right Triangle):**
    
    *   Logic: The inner loop runs `line` times.
        
    *   Row 1 has 1 star, Row 2 has 2 stars, etc.
        
*   **Inverted Star Pattern:**
    
    *   Logic: The inner loop runs `n - line + 1` times.
        
    *   Row 1 has `n` stars, Row 2 has `n-1` stars, etc.
        
*   **Half Pyramid (Numbers):**
    
    *   Similar to the star pattern, but prints the column number (`num`) instead of `*`.
        
*   **Character Pattern:**
    
    *   Uses a `char` variable (`ch`) that increments (`ch++`) inside the loops to print 'A', 'B', 'C', etc., in a triangular shape.
        

* * *

**3\. Advanced Patterns**

These patterns require more complex logic, often involving multiple inner loops (one for spaces, one for stars).

*   **Hollow Rectangles/Rhombus:**
    
    *   Logic: Uses `if` statements inside the loops to print stars _only_ at the boundaries (`i == 1`, `i == n`, `j == 1`, `j == n`) and spaces elsewhere.
        
*   **Butterfly Pattern:**
    
    *   Logic: Divided into two halves (upper and lower).
        
    *   Each row consists of: \[Stars\] + \[Spaces\] + \[Stars\].
        
    *   The number of spaces is calculated as `2 * (n - i)`.
        
*   **Solid Rhombus:**
    
    *   Logic: For each row `i`, print `n - i` spaces first, then print `n` stars. This "tilts" the square into a rhombus.
        
*   **0-1 Triangle:**
    
    *   Logic: Prints '1' if the sum of row and column (`i + j`) is even, and '0' if it is odd.
        
*   **Floyd's Triangle:**
    
    *   Logic: Uses a continuous `counter` variable that increments across the entire pattern (1, 2 3, 4 5 6, etc.).
        

* * *

**4\. Complex Pyramid Patterns**

These combine spaces and logic to create centered shapes.

*   **Number Pyramid:**
    
    *   Prints row numbers separated by spaces to form a centered pyramid.
        
    *   Logic: \[Spaces\] + \[Row Number + " "\].
        
*   **Palindromic Pyramid:**
    
    *   A symmetrical number pattern (e.g., 1, 2 1 2, 3 2 1 2 3).
        
    *   Logic: Requires _two_ inner loops. One to count _down_ (`i` to 1) and one to count _up_ (2 to `i`).
        
*   **Diamond Pattern (Star):**
    
    *   Logic: Combines an upper pyramid loop and a lower inverted pyramid loop.
        
    *   The number of stars follows the odd number sequence (`2*i - 1`).
        

* * *

**What I Practiced in this Module**

*   **Simple Shapes:**
    
    *   Star Pattern (Right-angled triangle)
        
    *   Inverted Star Pattern
        
    *   Half Pyramid (Numbers 1, 12, 123...)
        
    *   Inverted Half Pyramid (Numbers 12345, 1234...)
        
    *   Character Pattern (A, BC, DEF...)
        
*   **Logical Shapes:**
    
    *   Hollow Rhombus (Boundary checks)
        
    *   0-1 Triangle (Odd/Even logic)
        
    *   Floyd's Triangle (Continuous counter)
        
    *   Solid Rhombus (Spaces + Stars)
        
*   **Complex/Symmetrical Shapes:**
    
    *   Butterfly Pattern (Mirrored structure)
        
    *   Diamond Pattern (Full centered diamond)
        
    *   Number Pyramid (Centered)
        
    *   Palindromic Pyramid (Numbers increasing and decreasing)
