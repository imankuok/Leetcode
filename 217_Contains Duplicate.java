class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i=0; i<nums.length;i++){
            if (numbers.contains(nums[i])) {return true;}
            
            numbers.add(nums[i]);
        }
        return false;
    }
}
