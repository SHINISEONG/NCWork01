public class Solution {
	public static void main(String[] args){
		int n=10;
        int answer = 1;
        int lastDec = 2;
        
        if (n <2)
		{
			answer=0;
			return;
//            return answer;
		} 
                
		
        
		for (int i = 3; i<n+1; i+=2)
		{
           	for (int j=2; j<=lastDec; j++)
			{
				System.out.println("j :" +j);
				System.out.println("lastDec :" + lastDec);
                if (i%j == 0){
                    break;
                } 
                if (j==lastDec){
                    answer++;
                    lastDec = i;
                }
               
            }//end of inner for
            
		} // end of outer for
        
//       return answer;
    } //end pub
} // end class