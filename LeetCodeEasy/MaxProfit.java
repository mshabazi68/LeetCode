
import java.util.Collections;
import java.util.PriorityQueue;

//Selling the tickets in a way to get the max profit. 
// we have an array seats[] where the seats[i] where I is the number seats available at index. 
// the index is the row number 
// the price of the ticket is the same as number of seats available in each row ( index) 
// example if we have [ 4 ,3, 1] n is number of people here 3
// the max 4 + 3 + 3 = 10 

public class MaxProfit {

	
	public int maxPrf(int arr[] , int k , int n) {
		
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder()); 
		
		for ( int i=0; i<k; i++) {
			pQ.add(arr[i]);
		}
	//	System.out.println(" this is queue" + pQ);
		int profit =0; 
		int count =0;
		while (count <n) {
			
			int top = pQ.peek();
			
			
			pQ.poll();
			if(top == 0) {
				break;
			}
			profit = profit + top;
			
		pQ.add( top -1);
		//System.out.println(" this my tests " + pQ);
			count++;
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxProfit obj = new MaxProfit ();
		int  seats[] = { 2, 3, 4, 5, 1 };
		 int k = seats.length;  
		 int   n = 6; 
		System.out.println(obj.maxPrf(seats, k, n));
	}

}
