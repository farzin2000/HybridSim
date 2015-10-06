import java.math.BigInteger;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) 
		{
			String line = input.nextLine();
			String addr = line.split(" ")[2];
			BigInteger big = new BigInteger(addr);
			long pageAddr = big.divide(new BigInteger("4096")).longValue();
			System.out.println(line.split(" ")[0]+" "+line.split(" ")[1]+" "+pageAddr);
		}
	}
}
