package Day3;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int [] arr = new int [] {1, 2, 3, 4, 7, 1, 4, 8, 5, 7};   
	          
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }
		}

	}