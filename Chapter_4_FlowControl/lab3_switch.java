import java.util.Scanner;
public class lab3_switch {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the grades");
        char Grade = obj.nextLine().toCharArray()[0];
        System.out.println("input is " + Grade);
        String s = "jhakljfhlkdajfhlkdsjf";
        System.out.println(s.toCharArray()[2]);
        switch (Grade) {
            case 'A':
                System.out.println("marks between 80 to 100");
                break;
            case 'B':
                System.out.println("marks between 73 to 79");
                break;
            case 'C':
                System.out.println("marks between 65 to 72");
                break;
            case 'D':
                System.out.println("marks between  55 to 64");
                break;
            case 'E':
                System.out.println("less than 55");
                break;
            default:
                System.out.println("Grade does not exist");
        }
    }
}
