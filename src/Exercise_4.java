import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence and see how much words it contains");
        String myString = sc.nextLine();

        System.out.println(stringCounter(myString));
    }

    public static int stringCounter(String str){
       if (str== null || str.isEmpty()){
           return 0;
       }
        // If we want to mention this during the lecture there is also a specific class used for strings to count words
        // StringTokenizer -  it has a method yourString.countTokens
        // I discovered this way of splitting Strings in my Java book in the chapter of Strings
        String[] words = str.split("\\s+");
       return words.length;
    }
}
