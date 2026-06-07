package revision;

import java.util.Scanner;

public class Revision1 {
 
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Length of Array :");
  
	int len = sc.nextInt();
	
	int[] arr = new int[len];
	
	for(int i = 0; i < len; i++) {
		System.out.println("Enter Index : "+ i + " Value");
		arr[i] = sc.nextInt();
		
		}
	System.out.println("Input Complete !!");
	
	System.out.println("Output :- !!");
	
	for(int i: arr) {
		System.out.println(i + " ");
	}
	sc.close();
}
}
