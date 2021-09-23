class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int count=0;
 for(int i=0;i<arr.length;i++){
        count+=arr[i];
        }
        if(arr.length>1 && arr.length%2 != 0 ){
            
        count*=2;
        }
        
for(int k=2;k<arr.length-1;k=k+2){
    
    for(int i=0;i<(arr.length-k);i++){
        
        for(int j=i;j<=(i+k);j++){
            count+=arr[j];
        }
    }
}

return count;
    }
}
