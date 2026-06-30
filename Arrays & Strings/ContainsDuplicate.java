import java.util.Arrays; 
class ContainsDuplicate{
    public boolean containsDuplicate(int[]nums){
        Arrays.sort(nums);
        int i = 0 ; 
        int j = 1; 
        while(j< nums.length){
            if(nums[i]==nums[j]){
                return true;  
            }
            i++;
            j--; 
        }
        return false; 
    }
    public static void main (String[]args){
        int []nums = {1, 2, 3, 1}; 
        boolean result = new ContainsDuplicate().containsDuplicate(nums);
        System.out.println(result);

    }
}
