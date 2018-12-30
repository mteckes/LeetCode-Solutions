package leetCode;
import java.lang.StringBuilder;
public class reverseOnlyLetters 
{
	public static String reverseOnlyLetters(String S) 
	{
		char[] tempArray = S.toCharArray();
		StringBuilder toReverse = new StringBuilder();
		int frontPtr = 0;
		int rearPtr = tempArray.length-1;
		boolean swap = true;

		// If the String is Empty
		if(S.length() == 0)
		{
			return "";
		}

		// If the String only has 1 character

		if(S.length() == 1)
		{
			return S;
		}

		// Walk and Swap
		while(frontPtr != rearPtr && frontPtr < rearPtr)
		{
			//System.out.println("The pointrs are ( " + frontPtr + " , " + rearPtr + ")");
			swap = true;
			// Make sure Front point is a letter, else move pointer forward
			if(tempArray[frontPtr] < 'A' || (tempArray[frontPtr] > 'Z' && tempArray[frontPtr] < 'a') )
			{
				//System.out.println("Invalid Character: frontPtr =  " + frontPtr);
				frontPtr++;
				swap = false;
				
			}

			if(tempArray[rearPtr] < 'A' || (tempArray[rearPtr] > 'Z' && tempArray[rearPtr] < 'a') )
			{
				//System.out.println("Invalid Character: rearPtr =  " + rearPtr);
				rearPtr--;
				swap = false;
				
			}


			if(swap == true)
			{
				
				char tempChar = tempArray[frontPtr];
				tempArray[frontPtr] = tempArray[rearPtr];
				tempArray[rearPtr] = tempChar;
				frontPtr++;
				rearPtr--;
				//System.out.println("Look I swapped");
			}

		} // end while



		// Put characters into the StringBuilder
		for(int i = 0; i < tempArray.length; i++)
		{
			toReverse.append(tempArray[i]);
		}

		return toReverse.toString();


	}

	public static void main(String[] args) 
	{
		String testCase;
		String outputStr;

		// Test Case 1
		testCase = "ab-cd";
		outputStr = reverseOnlyLetters(testCase);
		System.out.println(outputStr);

		// Test Case 2
		testCase = "a-bC-dEf-ghIj";
		outputStr = reverseOnlyLetters(testCase);
		System.out.println(outputStr);

		// Test Case 3
		testCase = "Test1ng-Leet=code-Q!";
		outputStr = reverseOnlyLetters(testCase);
		System.out.println(outputStr);


	}

}
