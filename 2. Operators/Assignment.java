public class Assignment {
    public static void main(String[] args) {
        System.out.println("QUESTION 1");
        int x = 2;
        int y = 5;

        int exp1 = (x * y / x); 
        int exp2 = (x * (y / x));

        System.out.print(exp1 + ",");
        System.out.println(exp2);

        // here the out put of the code will be (5,4)
        // this is becoz the data type here is int and the 2.5 will be read as 2
        System.out.println();

        System.out.println("QUESTION 2");

        int x1 = 200, y1 = 50, z1 = 100;
        if(x1 > y1 && y1 > z1)
        { 
            System.out.println("Hello");
        }
        if(z1 > y1 && z1 < x1)
        {
            System.out.println("Java");
        }
        if((y1+200) < x1 && (y1+150) < z1)
        { 
            System.out.println("Hello Java");
        }
        /*
         here  the output of the code will be Java
         simple reason of fail of and logic condition 
         */
        System.out.println();

        System.out.println("QUESTION 3");

        int x2, y2, z2;
        x2 = y2 = z2 = 2; 
        x2 += y2;
        y2 -= z2;
        z2 /= (x2 + y2);
        System.out.println(x2 + " " + y2 + " " + z2);

        /*
         here the out put will be 4 0 0
         this is becoz the data type of z is int thus 0.5 is taken as 0
         */
        System.out.println();

        System.out.println("QUESTION 4");

        int x3 = 9, y3 = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x3 + 34) + 9 * (a + b * c) + (3 + y3 * (2 + a)) / (a + b*y3);
        System.out.println(exp); 

        // out put here is 278, try avoiding calculation mistakes here
        System.out.println();

        System.out.println("QUESTION 5");

        int x4 = 10, y4 = 5;
        int exp11 = (y4 * (x4 / y4 + x4 / y4)); 
        int exp22 = (y4 * x4 / y4 + y4 * x4 / y4);
        System.out.println(exp11); 
        System.out.println(exp22);

        /*
         Here the simple calcultion and the will be 20 20
         */
    }
}
