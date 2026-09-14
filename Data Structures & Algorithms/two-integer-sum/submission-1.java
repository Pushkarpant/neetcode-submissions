class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<nums.length;i++){

        int rr = target-nums[i];

        if(map.containsKey(rr)){
            return new int[]{map.get(rr),i};
        }

        map.put(nums[i], i);

    }

    return new int[]{};






        
    }
}
