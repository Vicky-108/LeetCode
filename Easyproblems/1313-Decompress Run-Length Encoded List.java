class Solution {
   public static  int[] decompressRLElist(int[] nums) {
        ArrayList<Integer>ll=new ArrayList();
         for(int i = 0; i<nums.length; i = i+2){
             for(int j = 0; j<nums[i]; j++){
                 ll.add(nums[i+1]);
             }
         }
    int aa[] = new int [ll.size()];
        for(int i = 0; i<aa.length; i++){
            aa[i] = ll.get(i);
        }
    return aa;
    }
}


