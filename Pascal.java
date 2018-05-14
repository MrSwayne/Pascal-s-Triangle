import javax.swing.*;
import java.math.*;
public class Pascal
{
	/*
		TODO:
		Add trianglular output (probably will break down after like 15 rows or so)
	*/
	
	public static void main(String[] args)
	{
		//Up to how many rows to calculate (not for the feint of heart)
		int row = 900;

		pascalsTriangle(row);
	}

	//Displays Pascal's Triangle
	public static void pascalsTriangle(int row)
	{
		for(long i = 0;i < row;i++)
		{
			for(long j = 0;j <=  i; j++)
				//Calculates i choose j; i being row number and j being element number. basically calculates each individual element on each row and prints it out
				System.out.print(calculate(new BigInteger(Long.toString(i)), new BigInteger(Long.toString(j))) + " ");
			System.out.println();
		}
	}

	//NchooseR for 2 big integers
	public static BigInteger calculate(BigInteger n, BigInteger r)
	{
		return ((fact(n)).divide((fact(r)).multiply(fact(n.subtract(r)))));
	}

	//calculates factorial
	public static BigInteger fact(BigInteger n)
	{
		if 			(n.equals(new BigInteger("0")))		return new BigInteger("1");
		else											return n.multiply(fact(n.subtract(new BigInteger("1"))));
	}
}
