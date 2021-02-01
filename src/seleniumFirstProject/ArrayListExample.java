package seleniumFirstProject;

import java.util.ArrayList;

import org.testng.annotations.Test;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		// expected --- 4-2, 5-3, 6-2 , 9---1

		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++) 
		{
			int k=0;
			
			if(!ab.contains(a[i])) 
			{
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) 
				{
					if(a[i]==a[j]) 
					{
						k++;
					}
			
				}
				System.out.println("The no. "+a[i]+ " is repeated " + k + " times");
				if(k==1) 
				{
					System.out.println("The unique number is: " + a[i]);
				}
				
			}
			
			
			
		}
		
	}

}
