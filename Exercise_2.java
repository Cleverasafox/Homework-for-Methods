public class Exercise_2 {
    public static void main(String[] args) {

        System.out.println(findAvaregeNum(56.5,353.4,33.2));

        double anotherWayToCallMethod = findAvaregeNum(5,5,5);

        System.out.println(anotherWayToCallMethod);

    }

    public static double findAvaregeNum(double x,double y, double z){
        return (x + y + z)/3;
    }
}
