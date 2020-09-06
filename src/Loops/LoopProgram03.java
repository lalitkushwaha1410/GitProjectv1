package Loops;

public class LoopProgram03 {

	public static void main(String[] args) {
		
		int i=1;
		
		while (i<=10)
			
		{
			if(i%7 == 0)
			{
				break; // continue; also work fine
			}
			
			else {
				
				System.out.println(i);	
		}
		
		i++;
		
	   }

   }
}