package practice;

import org.testng.annotations.Test;

public class array {

	@Test
	public void singleArray() {

		int a[][]= {{2,3,4},{5,8,9},{12,34,66}};
		//int min=a[0][0];
		int max=a[0][0];
		int col=0;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0; j<a.length;j++) {
				
				if(a[i][j]>max) {
					
					max=a[i][j];
					col=j;
				}
			}
		}
		
		System.out.println(max);
		int k=0;
		int min=a[k][col];
		
		
		for(k=0;k<3;k++) {
			
			if(a[k][col]<min) {
				
				min=a[k][col];
			}
			
			
			
			
		}
		
		
		System.out.println(min);
}}
