package jimPractice;

import java.util.ArrayList;

public class DRoot {
	
	public static int digital_root(int n) {
		ArrayList<Integer> numbList = new ArrayList<>();
		int grandTotal = 0;
		if(n<10) {
			return n;
		}
		while(n>9) {
		int number = n%10;
		System.out.println("last digit is: " +number);
		numbList.add(number);
		n = n/10;
		System.out.println("n is: " + n);
		System.out.println("grandtotal in loop: "+ grandTotal);
		}
		numbList.add(n);// add the list remaining int
		for(Integer x: numbList) {
			grandTotal += x;
		}
		System.out.println("grandtotal after the loop "+grandTotal); 
		if(grandTotal>9) {
			System.out.println("it was larger than 9");
			digital_root(grandTotal);//recursive call of method if result still double digits
			
			return digital_root(grandTotal);
		}
		
		return grandTotal;
	    
	  }

	public static void main(String[] args) {
		System.out.println(digital_root(132189)); 

	}

}
