package leetCode;

public class toLowerCase 
{

	// Attempt 1
	public String toLowerCase(String str) 
	{
		StringBuilder toLower = new StringBuilder();

		if(str.length() == 0)
		{
			return str;
		}

		for(int i = 0; i < str.length(); i++ )
		{
			char tempChar = str.charAt(i);
			if(tempChar >= 'A' && tempChar <= 'Z')
			{
				tempChar += 32;
			}

			toLower.append(tempChar);
		}

		return toLower.toString();
	}
	
	/*// Attempt 2
	public String toLowerCase(String str) 
    {
        if(str.length() == 0)
        {
            return str;
        }
        
       char[] tempStr = str.toCharArray();
        for(int i = 0; i < tempStr.length; i++ )
		{
			char tempChar = tempStr[i];
			if(tempChar >= 'A' && tempChar <= 'Z')
			{
				tempChar += 32;
                tempStr[i] = tempChar;
			}

		}
        
        return String.valueOf(tempStr);
    }
	*/

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
	

	}

}
