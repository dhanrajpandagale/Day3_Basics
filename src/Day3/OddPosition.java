package Day3;

public class OddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {6, 21, 57, 45, 15, 63};  
		System.out.println("Elements of given array present on odd position: ");
				
		//Loop through the array by incrementing value of i by 2  
		//Here, i will start from 1 as first even positioned element is present at position 1.  
		        
		for (int i = 0; i < arr.length; i = i+2) {  
		System.out.println(arr[i]);  
      }
	}

}