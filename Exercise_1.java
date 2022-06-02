public class Exercise_1 {
    public static void main(String[] args) {

        findSmallestNum(7,10,-40);
        findSmallestNum(7,7,7);
        findSmallestNum(121321, 232312, 522141521);


    }

    public static void findSmallestNum(int x,int y,int z){

        if((x<=y) && (x< z)){
            System.out.println("Smallest number is: " + x);
        } else if (y<=x  && y<=z) {
            System.out.println("Smallest number is: "+ y);
        }else {
            System.out.println("Smallest number is: "+ z);
        }
    }
}
