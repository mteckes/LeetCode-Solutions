package leetCode;

public class numberOfLines 
{
	public static int[] numberOfLines(int[] widths, String S) 
    {
        int numOfLines = 1; // Start out at 1 line
        int remainder = 0;
        int widthCount = 0;
        int maxWidth = 100;
        
        // Walk over the string to find the lenth
        for(int i = 0; i < S.length(); i++)
        {
        	 char findWidth = S.charAt(i);
        	 int tempWidth = widths[findWidth - 97];
        	 // If it does not need a new line
        	 if(tempWidth + widthCount <= maxWidth)
        	 {
        		 widthCount += tempWidth;
        	 }
        	 // new line is created
        	 else
        	 {
        		 numOfLines++;
        		 widthCount = tempWidth;
        	 }
        	 
        } // for
        
        remainder = widthCount;
        int[] toReturn = { numOfLines, remainder}; // will return
        return toReturn;
        
    } // numberOfLines
	
	
	public static void main(String[] args) 
	{
		int[] output = new int[2];
		
		// Test Case 1
		int[] widths1 = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S1 = "abcdefghijklmnopqrstuvwxyz";
		output = numberOfLines(widths1, S1);
		System.out.println("[ " + output[0] + ", " + output[1] + " ]");
		
		//Test Case 2
		int[] widths2 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S2 = "bbbcccdddaaa";
		output = numberOfLines(widths2, S2);
		System.out.println("[ " + output[0] + ", " + output[1] + " ]");
	}

}
