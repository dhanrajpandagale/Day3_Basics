package Day3;

public class SamallestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {39, 21, 317, 255, 156};  
        //Initialize min with first element of array.  
        int min = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min); 
	
}

}