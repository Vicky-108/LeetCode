class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int gn = nums[nums.length-1];
        int sn = nums[0];
        int remain = gn%sn;
       
        while(remain != 0){
           gn = sn;
           sn = remain;
           remain = gn%sn;
       } 
        return sn;
   }

}
