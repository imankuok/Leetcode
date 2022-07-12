class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result= new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        
        for (int p = j; p>= 0; p--){
            if (Math.abs(nums[j])>Math.abs(nums[i])){
                result[p] = nums[j]*nums[j];
                j--;
            }
            
            else {result[p] = nums[i]*nums[i]; i++;}
        }
        
        return result;
    }
}
