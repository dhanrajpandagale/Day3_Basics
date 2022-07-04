package Day3;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, size;
	      int array[] = {12, 28, 32, 33, 98, 87};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second largest number is:: "+array[size-2]);
	   }
	}