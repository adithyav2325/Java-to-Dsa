public class Examples {

    public static void star_pattern(int n){
        System.out.println("STAR PATTERN");
        for(int line = 1; line<=n; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
         }
        System.out.println();
    }

    public static void inverted_star_pattern(int n){
        System.out.println("INVERTED STAR PATTERN");
        for(int line = 1; line<=n; line++){
            for(int j = 1; j<=(n-line+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void half_pyramid_pattern(int n){
         System.out.println("HALF PYRAMID PATTERN");
        for(int line = 1; line <= n; line ++){
            for(int num = 1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
        System.out.println();
    }

    

    public static void inverted_half_star_pattern(int n){
        System.out.println("INVERTED HALF PYRAMID");
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

    }

    

    public static void triangle_0_1(int n){
        System.out.println("0 & 1 TRIANGLE");
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rhombus (int n){
        System.out.println("RHOMBUS");
        for (int i = 1; i < n; i++) {
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
         Nested loops, we know we use nested conditional statments 
         but we can also use nested loops for the sloving the given 
         problems 
         */
        star_pattern(5);
        inverted_star_pattern(5);
        half_pyramid_pattern(5);
        inverted_half_star_pattern(5);
        triangle_0_1(5);
        rhombus(5);
    }
}
