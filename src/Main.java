public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("1: " + shouldWakeUp (true, 1));
        System.out.println("2: " + shouldWakeUp (false, 2));
        System.out.println("3: " + shouldWakeUp (true, 8));
        System.out.println("4: " + shouldWakeUp (true, -1));
        System.out.println("***********************************");
        System.out.println("1: " + hasTeen(9, 99, 19));
        System.out.println("2: " + hasTeen(23, 15, 42));
        System.out.println("3: " + hasTeen(22, 23, 34));
        System.out.println("***********************************");
        System.out.println("1: " + isCatPlaying(true, 10));
        System.out.println("2: " + isCatPlaying(false, 36));
        System.out.println("3: " + isCatPlaying(false, 35));
        System.out.println("***********************************");
        System.out.println("1: " +  area(5.0, 4.0));
        System.out.println("2: " +  area(-1.0, 4.0));
        System.out.println("***********************************");
        System.out.println("1: " +  area(5.0));
        System.out.println("2: " +  area(-1.0));
    }
    public static boolean shouldWakeUp(boolean isBarking, int time) {
        if(!isBarking){
            return false;
        }
        if(time<0){
            return false;
        }
        if(time<=20 && time>=8){
            return false;
        }
        return true;

    }
    public static boolean hasTeen(int age1, int age2, int age3){
        return (age1<20 || age2<20 || age3<20);


    }
    public static boolean isCatPlaying(boolean isSummer, int temp){
        if(isSummer && temp>=25 && temp<=45){
            return true;
        }
        if(!isSummer && temp>=25 && temp<=35){
            return true;
        }
        return false;
    }
    public static double area(double wall1, double wall2){
        if(wall1<0 || wall2<0){
            return -1;
        }
        return wall1*wall2;
    }
    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return Math.PI*Math.pow(radius,2);
    }


}