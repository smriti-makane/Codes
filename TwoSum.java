import java.util.HashMap; 
class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i<nums.length; i++){
            int rem = target-nums[i]; 
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i}; 
            }
            map.put(nums[i], i); 
        }
        return new int[]{}; 
    }
    public static void main(String[]args){
        int[]nums = {2,7,11,15}; 
        int result[]=new TwoSum().twoSum(nums,9); 
        System.out.println(result[0]+"" + result[1]);
    }
}    