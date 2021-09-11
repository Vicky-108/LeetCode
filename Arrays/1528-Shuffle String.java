class Solution {
    public String restoreString(String s, int[] indices) {
      String ss="";
	  char [] cc = new char[ indices.length ];
		
        for (int i = 0;i<indices.length ; i++ ){
		    cc[ indices[i] ] = s.charAt(i);
		} 
        for (int i=0;i<indices.length ;i++ ){
		 ss = ss + cc[i];
		}
        
	return ss;
    }
}
