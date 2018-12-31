package leetCode;

public class sortByParity 
{
	// Check my answers
	public static void printArray (int[] toPrint)
	{
		for(int i = 0; i < toPrint.length; i++)
		{
			System.out.print(toPrint[i] + ",");
		}
		System.out.println();
	}
	
	// Sort array by parity bit
	public static int[] sortArrayByParity(int[] A) 
	{
		int lowPtr = 0; 
		int highPtr = A.length - 1;
		int parity = 1;
		boolean lowSwap = true;
		boolean highSwap = true;

		while(lowPtr < highPtr)
		{
			// Don't swap if parity is 0
			if((A[lowPtr] & parity) == 0)
			{
				lowSwap = false;
				lowPtr ++;
			}
			
			// Done swap if parity is 1
			if( (A[highPtr] & parity) == 1 )
			{
				highSwap = false;
				highPtr --;

			}

			// Swap
			if(lowSwap == true && highSwap == true)
			{
				int temp = A[lowPtr];
				A[lowPtr] = A[highPtr];
				A[highPtr] = temp;
			}
			
			// Reset swap conditions
			lowSwap = true;
			highSwap = true;

		}


		return A;
	}

	public static void main(String[] args) 
	{
		// Test Case 1
		int[] test1 = {1,2,4,3};
		int[] output = sortArrayByParity(test1);
		printArray(output);

		// Test Case 1
		int[] test2 = { 3 , 1 , 2, 4 };
		output = sortArrayByParity(test2);
		printArray(output);

	}

}
