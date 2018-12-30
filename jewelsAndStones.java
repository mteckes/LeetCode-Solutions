package leetCode;
import java.util.HashSet;

public class jewelsAndStones 
{

	public static int numJewelsInStones(String J, String S) 
    {
        int totalJewels = 0;
        HashSet countJewels = new HashSet();
        
        // Check if either String is empty
        if(J.length() == 0 || S.length() == 0)
        {
        	return 0;
        }
 
        // Walk to to put into HashSet
        for(int i = 0; i < J.length(); i++ )
        {
        	countJewels.add(J.charAt(i));
        }
        
        // Check if a stone in S is a Jewel
        for(int i = 0; i < S.length(); i++)
        {
        	if(countJewels.contains(S.charAt(i)))
        	{
        		totalJewels++;
        	}
        }
        
        return totalJewels;
    }
	
	public static void main(String[] args) 
	{
		// Test Case 1
		String J = "aA";
		String S = "aAAbbbb";
		int output = numJewelsInStones(J, S);
		System.out.println("The number of Jewels is: " + output);

		// Test Case 2
		J = "z";
		S = "ZZ";
		output = numJewelsInStones(J, S);
		System.out.println("The number of Jewels is: " + output);
				
	}

}
