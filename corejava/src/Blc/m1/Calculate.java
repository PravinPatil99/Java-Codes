package Blc.m1;

public class Calculate 
{
	
	public static int getSquareAndCube(int num)
	{
		if(num<0)
		{
			return -1;
		}
		else if(num%2==0)
		{
			return num*num;
		}
			
	         else 
		 return num*num*num;
		}
		}
	
	







/*Calculate.java
---------------
/*Program to find out the square and cube of 
  the number by following criteria
 * 
a) If number is 0 or Negative it should return -1
b) If number is even It should return square of the number
c) If number is odd It should return cube of the number
*/

