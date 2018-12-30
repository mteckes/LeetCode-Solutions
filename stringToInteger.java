package leetCode;
import java.lang.StringBuilder;
import java.io.IOException;
import java.lang.Throwable;

public class stringToInteger 
{

	public static int myAtoi(String str) 
	{
		int INT_MIN = -2147483648;
		int INT_MAX = 2147483647;
		int outputInt = 0;
		boolean isLetter = false;
		boolean isNumber = false;
		int inARow = 0;
		StringBuilder toConvert = new StringBuilder();

		if(str.length() == 0)
		{
			return outputInt;
		}

		for(int i = 0; i < str.length(); i++)
		{
			char tempChar = str.charAt(i);
			int valOfChar = (int)tempChar;
			//System.out.println(valOfChar);
			if(tempChar == ' ' || tempChar == '+')
			{
				if(tempChar == '+')
				{
					inARow += 1;
				}
				if(inARow >1)
				{
					break;
				}
				if(tempChar == ' ' && inARow == 1)
				{
					break;
				}
				if(tempChar == '+' && isNumber == true)
				{
					break;
				}
				if(tempChar == ' ' && isNumber == true)
				{
					break;
				}
				continue;
			}
			else if(valOfChar >= 48 && valOfChar <=57 || tempChar == '-')
			{
				if(tempChar == '-')
				{
					inARow +=1;
					isLetter = true;
					if(inARow >1)
					{
						break;
					}
					if(isNumber == true)
					{
						break;
					}
				}
				else
				{
					isNumber = true;
				}

				toConvert.append(tempChar);
			}
			else
			{
				isLetter = true;
				if(isNumber == false && isLetter == true)
				{
					return outputInt;
				}
				break;
			}
		}

		try
		{

			//System.out.println("Hello from Try");
			if(isNumber == false && isLetter == true)
			{
				return outputInt;
			}
			if(toConvert.length() == 0)
			{
				return 0;
			}
			else
			{
				outputInt = Integer.parseInt(toConvert.toString());
				//System.out.println(outputInt);
				return outputInt;
			}
		}
		catch(Exception e)
		{
			//System.out.println("Hello from Catch");
			if(toConvert.charAt(0)=='-')
			{
				return INT_MIN;
			}
			else
			{
				return INT_MAX;
			}
		}



		// return outputInt;
	}
	public static void main(String[] args) 
	{
		String testString = "";
		int doneInt;
		int i = 1;

		// Test Case 1
		System.out.println("Test Case: " + i);
		i++;
		testString = "-42";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

		// Test Case 2
		System.out.println("Test Case: " + i);
		i++;
		testString = "-";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

		// Test Case 3
		System.out.println("Test Case: " + i);
		i++;
		testString = "+";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

		// Test Case 4
		System.out.println("Test Case: " + i);
		i++;
		testString = "+1";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

		// Test Case 5
		System.out.println("Test Case: " + i);
		i++;
		testString = "+-2";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

		// Test Case 6
		System.out.println("Test Case: " + i);
		i++;
		testString = "   +0 123";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

		// Test Case 7
		System.out.println("Test Case: " + i);
		i++;
		testString = "0-1";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

		// Test Case 8
		System.out.println("Test Case: " + i);
		i++;
		testString = "0+1";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

		// Test Case 9
		System.out.println("Test Case: " + i);
		i++;
		testString = "0 123";
		doneInt = myAtoi(testString);
		System.out.println(doneInt);

	}

}
