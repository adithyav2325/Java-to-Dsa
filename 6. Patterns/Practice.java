public class Practice {

    public static void character_pattern(int n){
        System.out.println("CHARACTER PATTERN");
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;    
            }
            System.out.println();
        }
         System.out.println();
    }

    public static void floyads_pattern(int n){
        System.out.println("FLOYAD'S TRIANGLE");
        int counter = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void butterfly(int n){
        System.out.println("BUTTERFLY");
        for (int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hollow_rhombus(int n){
        System.out.println("HOLLOW RHOMBUS");
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        character_pattern(5);
        floyads_pattern(5);
        butterfly(5);
        hollow_rhombus(5);
    }
}
