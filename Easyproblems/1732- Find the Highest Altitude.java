class Solution {
    public int largestAltitude(int[] gain) {
        int [] al = new int [gain.length+1];
        al[0] = 0;
        for(int i = 0; i<gain.length; i++){
            al[i+1] = al[i] + gain[i];
            }
        Arrays.sort(al);
        
return al[al.length-1];
    }

}
