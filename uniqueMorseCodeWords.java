package leetCode;
import java.util.HashSet;
import java.lang.StringBuilder;



/*
[".-","-...","-.-.","-..",".","..-.","--.","....","..",
".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
"...","-","..-","...-",".--","-..-","-.--","--.."]
		
		
	*/	

public class uniqueMorseCodeWords 
{
	public static int uniqueMorseRepresentations(String[] words) 
	{
		// Given morse code
		String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
				".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
				"...","-","..-","...-",".--","-..-","-.--","--.."};
		
		
		int totalUnique = 0;
		HashSet holdsUnique = new HashSet();
		StringBuilder tempMorseCode = new StringBuilder();
		
		
		// go through the letters
		for(int i = 0; i < words.length; i++)
		{
			String tempStr = words[i]; // the string
			
			// Walk through the string, and create a temp string 
			// with the morse code
			for(int j = 0; j < tempStr.length(); j++)
			{
				int tempInt = (int)tempStr.charAt(j) - 97;
				String tempMorse = morseCode[tempInt];
				tempMorseCode.append(tempMorse);
				
			}
			
			// Use HashSet to see if the morse code string is unique
			if(holdsUnique.contains(tempMorseCode.toString()) == false)
			{
				holdsUnique.add(tempMorseCode.toString());
				totalUnique++;
			}
			
			// Reset the StringBuilder
			tempMorseCode = new StringBuilder();
			
		}
		
		
		
		return totalUnique;
		

	}


	public static void main(String[] args) 
	{
		// Test Case 1
		String[] testCase = {"gin","zen","gig","msg"};
		int finalCount = uniqueMorseRepresentations(testCase);
		System.out.println("The total unique is: " + finalCount);
		

	}

}
