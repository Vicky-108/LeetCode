class Solution {
    public String truncateSentence(String s, int k) {
        String []st=s.split(" ");
        String sm="";
        for(int i=0;i<k;i++){
            if(i == (k-1)){
                sm=sm+st[i];
            }else{
            sm= sm +st[i]+" ";
        }
    }
        
       return sm; 
    }
}
