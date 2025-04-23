class Solution {
    public String removeTrailingZeros(String num) {

      //keepstring
      int n=num.length()-1;
      int findLastIndexZero = n;
      for(int i=n; i>=0; i--){
        if(num.charAt(i) == '0'){
            findLastIndexZero--;
        }else{
            return num.substring(0,findLastIndexZero+1); 
        }
      }
      return num; 
        
    }
}