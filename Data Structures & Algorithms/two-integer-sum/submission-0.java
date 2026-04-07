class Solution {
    public int[] twoSum(int[] nums, int target) {

      Map<Integer,Integer> hashmap = new HashMap<>();
        int[] result=new int[2];
      for(int i =0;i<nums.length;i++)
      {
        int remaining = target - nums[i];
        if(hashmap.containsKey(remaining)){
            result[0]= hashmap.get(remaining);
            result[1] = i;
            return result;
        }

        hashmap.put(nums[i],i);

      }

     return result;
    }
}
