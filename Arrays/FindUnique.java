//Given an array of integers, every element appears twice except for one. Find that single one.
//O(N) solution with O(1) space complexity
    public int singleNumber(int[] nums) {
        
        int marker=0;
        
        for(int i=0;i<nums.length;i++){
            marker = marker ^ nums[i];
        }
        
        return marker;
        
    }
