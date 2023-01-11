package Exercise_01;

public class exercise_i {
	public static void main(String args[]) {
	
	int[]num= {1,2,3,4,5,6,7,8,9,10};
	  
	float total=0;
	float average;
	double deviation;
	
	for(int i=0;i<num.length;i++) {
		 
		 total=total+num[i];
	   }
	
	  average=total/num.length;
	  
	  System.out.println("The average is:"+ average);
	 	  
	 
	  float sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += (num[i] - average) * (num[i] - average);
		}
		
		
		deviation = Math.sqrt(sum /num.length);
		
		System.out.println("The deviation is:"+ deviation);
		
	  
	 }
	 
	
	}	


