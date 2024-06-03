package jimPractice;

import java.util.ArrayList;

import java.util.Collections;

// a function that can take any non-negative integer as an argument and return it with its digits in descending order. 
//Essentially, rearrange the digits to create the highest possible number.
public class DescendingOrder {
	public static int sortDesc(final int num) {
		int lastDigit;
		int newNum = num;
		int result = 0;
		int counter = 1;
		ArrayList<Integer> numbList = new ArrayList<>();
		System.out.println(newNum);
		if(num<0) {
			throw new IllegalArgumentException("num has to be a non- negative integer");
		}else if (num<10) {
			return num;
		}else {
			while(newNum>9) {
				
				lastDigit = newNum%10;
				newNum = newNum/10;
				numbList.add(lastDigit);//each time through the loop add the last digit of numb to the arraylist
				System.out.println(newNum);
			}
			numbList.add(newNum);//add the single remaining digit to the list
			Collections.sort(numbList);
			//Collections.reverse(numbList);
			
			for(int x: numbList) {
				System.out.println("number in the list " +x);
				result += x * counter;
				counter *= 10;
			}
			System.out.println(result);
			
			return result;
		}
		
	  }
	

	public static void main(String[] args) {
		sortDesc(145263);

	}

}
