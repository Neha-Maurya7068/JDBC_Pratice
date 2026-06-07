package revision;

public class Minimum {
  public static void main(String[] args) {
	 
	  int []arr = {10, 5, 4, 8, 20, 30, 1, 25};
	  
	  int min = arr[0];
	  
	  for(int i = 1; i < arr.length; i++) {
		  if(arr[i] < min) {
			  min = arr[i];
		  }
	  }
	  System.out.println("Minimum Value is: "+min);
}
}
