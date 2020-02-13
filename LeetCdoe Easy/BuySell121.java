
public class BuySell121 {
	 public int maxProfit(int[] prices) {
	    int min = Integer.MAX_VALUE;
	    int max = 0;
	   // int pos= 0;
		 for ( int i=0; i<prices.length; i++) {
			 if ( prices[i]<min) {
				 min = prices[i];
				
			 }else { 
				 max = Math.max(max, prices[i]-min);
			 }
		 }
		
		 return max;
	    }
	public static void main(String[] args) {
		BuySell121 obj = new BuySell121();
		int arr []= {7,6,4,3,1};
	System.out.println(obj.maxProfit(arr));
	}

}
