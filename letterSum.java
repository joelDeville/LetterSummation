import java.util.Scanner;

public class letterSum
{
	public static void main(String[] args)
	{
		//scanner reading from system input stream (keyboard)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a message");
		
		String input = scan.nextLine();
		
		//if the input is not empty, then getSum is called
		if(!input.isEmpty())
			System.out.println(getSum(input));
		
		else
			return;
	}
	
	private static int getSum(String message)
	{
		int sum = 0;
		
		//iterating through each character of message and adding all alphanumerics to sum
		for(int i = 0; i < message.length(); i++)
		{
			char c = message.charAt(i);
			
			if(c != 32)
				sum += c;
		}
		
		return sum;
	}
}
