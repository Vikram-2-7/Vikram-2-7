package Java;
public class removeDuplicates {
    public int removeDuplicate(int[] nums) {
        if(nums.length == 0) return 0;
        
        int j =0;
        for(int i = 1; i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}