public class Exercise_3 {
        //    Write a Java method to display the middle character of a string.
        //    Note:
        //    a) If the length of the string is even there will be two middle characters.
        //    b) If the length of the string is odd there will be one middle character.

    public static void main(String[] args) {

        String test ="COLA69cola";
        String test2 = "LoL";

        System.out.println(printMiddleString(test));
        System.out.println(printMiddleString(test2));
    }

    public static String printMiddleString(String str){
       int length;
       int position;

       if (str.length()%2 == 0){
           position = str.length()/2 - 1;
           length = 2;
        }
       else {
           position = str.length()/2;
           length = 1;
       }

       return str.substring(position,position+length);
    }
}
