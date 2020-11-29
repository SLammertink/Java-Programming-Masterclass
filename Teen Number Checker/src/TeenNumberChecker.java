public class TeenNumberChecker {
    public static boolean hasTeen(int x, int y, int z){
        if (( x <= 19 & x >= 13) | (y <= 19 & y >= 13) | ( z <= 19 & z >= 13)) {
            //System.out.println(true);
            return true;
        }else {
            //System.out.println(false);
            return false;
        }

    }
}
