import java.util.Scanner;
public class CountVowels
	{

		public static void main(String[] args)
		{
			Scanner user = new Scanner(System.in);
			System.out.println("Enter Your text");
			String text = user.nextLine();
			countVowels(text);	
				
		}
		public static int countVowels(String s)
			{
				
				String [] myArray = s.split("");
				int counter = 0; 
			 for(int i=0; i < myArray.length; i++)
				 {
					 switch(myArray[i])
					 {
					 case "a":
					 case "e":
					 case "i":
					 case "o":
					 case "u":
					 case "A":
					 case "E":
					 case "I":
					 case "O":
					 case "U":
							 {
								 counter++; 
							 }
					 }
				 }
					 System.out.println(counter);
					
				 
			 return counter;
			}
	
		
	}
