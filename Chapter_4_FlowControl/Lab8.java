
//Write an application that prompts the user to enter the size of the side
//        of a square, then displays a hollow square of that size made of asterisks.
//
//        Your program should work for squares of all side lengths between 1 and 20.
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Lab8 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the side of the square between 1 and 20");
        String var = obj.nextLine();
        int var1 = parseInt(var);


        for (int j = 1; j <= var1; j++) {
            for (int i = 1; i <= var1; i++) {
                if (j == 1 || j == var1) {
                    System.out.print("* ");

                }
                if(j==2 || j==var1-1)
                {
                    if(i==1 || i==var1)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}
