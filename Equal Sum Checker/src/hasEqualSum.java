public class hasEqualSum {

    public static boolean hasEqualSum (int x, int y, int z){
        int a = x + y;
        if (a == z){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
}
