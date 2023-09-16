public class FirstBadVersion {
    public static int v;

    public static boolean isBadVersion(int s){
        return s >= v;
    }
    
    public static int[] isFirstBadVersion(int n){
        int first = 1;
        int last = n;
        int calls = 0;

        while (first < last){
            int mid = first + (last - first) / 2;
            
            if(isBadVersion(mid))
                last = mid;
            else
                first = mid + 1;

            calls++;
        }
        return new int[]{first, calls};
    }
}
