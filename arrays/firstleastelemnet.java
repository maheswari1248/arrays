package arrays;

import java.util.Scanner;

public class firstleastelemnet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=5;
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<max)
				max=arr[i];
		}
		System.out.println(max);
			
		

	}

}