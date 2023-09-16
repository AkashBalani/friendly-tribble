import java.util.List;

public class RotatedSearch {
    public static int binarySearchRotated(List<Integer> nums, int target){
        int start = 0;
        int end = nums.size() - 1;
        if(start > end)
            return -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums.get(mid) == target)
                return mid;
            if(nums.get(start) <= nums.get(mid)){
                if(nums.get(start) < target && target < nums.get(mid)){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(nums.get(mid) < target && target < nums.get(end))
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
