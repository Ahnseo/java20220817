package leetCode;

public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        
        // your code..
        for (int i = 0; i < n; i++) {
            res[i * 2] = nums[i];
            res[i * 2 + 1] = nums[i + n];
        }
        
//        java.util.Arrays.setAll(res, i -> (i % 2 == 0) ? nums[i / 2] : nums[i / 2 + n]);
//        						     	i -> 0 ,나머지가 0 ? ,true=> 0/2 =0  => nums[0]
//        								i -> 1 ,나머지가 0 ? ,false=> (int) 0/2+1 =1  => nums[1]
//        								i -> 2 ,나머지가 0 ? ,true=>  (int)   2/2 =1  => nums[1] 
//										i -> 3 ,나머지가 0 ? ,false=> (int) 3/2+1 =2  => nums[2]
//        							    i -> 4 ,나머지가 0 ? ,true=>  (int)   4/2 =2  => nums[2]         
        
        return res;
    }
}
