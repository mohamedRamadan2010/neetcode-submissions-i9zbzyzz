class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left=0,right=numbers.length-1;
        while(left<right){
            long sum = numbers[left]+numbers[right];
                if(sum == target)
                {
                    int[] res=new int[] {left+1,right+1};
                    return res;
                }else{
                    if(sum>target){
                        right--;
                    }else{
                        left++;
                    }
                }
        }
        
        return new int[] {0,0};
    }
}
