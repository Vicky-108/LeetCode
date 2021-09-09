class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int max = 0;
        for (int i=0; i<candies.length; i++) {
            if (candies[i] >= max) {
                max=candies[i];
            }
        }
        List<Boolean> ll = new ArrayList();
        for (int i = 0; i<candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                ll.add(true);
            } else {
                ll.add(false);
            }
        }
        return ll;
    }
}
