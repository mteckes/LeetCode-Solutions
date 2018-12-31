package leetCode;
import java.util.HashSet;
public class findRepeatedElement 
{
	public int repeatedNTimes(int[] A) 
	{
		HashSet findDup = new HashSet();
		int repeatedNum = -1;
		if(A.length == 0)
		{
			System.out.println("Empty");
			return -1;
		}

		for(int i = 0; i < A.length; i++)
		{
			if(findDup.contains(A[i]) == false)
			{
				findDup.add(A[i]);
			}
			else
			{
				repeatedNum = A[i];
			}
		}


		return repeatedNum;

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
