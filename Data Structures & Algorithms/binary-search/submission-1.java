class Solution {
    public int search(int[] nums, int target) {
    int numsLength=nums.length;
    if(numsLength>0){
            if(nums[numsLength/2]>target){
                for(int i =0;i< numsLength/2 ; i++ ){
                    if(nums[i]==target){
                        return i;
                    }
                }
            }else {
                for(int i =numsLength-1;i>=numsLength/2 ; i-- ){
                    if(nums[i]==target){
                        return i;
                    }
                } 
            }
    }
    return -1;
    }
}
