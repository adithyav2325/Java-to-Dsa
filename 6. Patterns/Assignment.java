public class Assignment {

    public static void star(int n){
        System.out.println("STAR PATTERN");
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=(2*i - 1) ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n; i>=1; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=(2*i - 1) ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void number_pyramid(int n){
        System.out.println("NUMBER PYRAMID");
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void palendromic_pyramid(int n){
        System.out.println("PALANDROMIC PYRAMID");
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            for(int j =2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
    }
    System.out.println();
}
    public static void main(String[] args) {
        System.out.println("QUESTION 1");
        star(4);
        System.out.println();

        System.out.println("QUESTION 2");
        number_pyramid(5);
        System.out.println();

        System.out.println("QUESTION 3");
        palendromic_pyramid(5);
        System.out.println();
    }
}
