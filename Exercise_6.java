import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check if its a Palindrome");

        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else {
            System.out.println("Number : "+ palindrome + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(int num){
        int palindrome  = num;
        int reverse = 0;

        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse*10 + remainder;
            palindrome = palindrome/10;
        }
        //if our initial number = the reverse number  they must be a palindrome
        if (num==reverse){
            return true;
        }
        return false;

    }
}
