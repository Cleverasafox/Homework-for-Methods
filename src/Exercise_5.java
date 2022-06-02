import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        isEven(num);
    }

    public static void isEven(int x) {
        if (x % 2 == 0) {
            System.out.println("Your number " + x + " is Even");
        } else {
            System.out.println("Your number " + x + " is unEven");
        }
    }

}