public class test5
{
	public static void main(String args[])
	{
		int num1=5;
		test5.evenorodd(num1);

		int num2=8;
		test5.evenorodd(num2);

		int num3=0;
		test5.evenorodd(num3);
	}
	public static void evenorodd(int num)
	{
		if(num%2==0)
		{
			for(int i=1;i<=num;i++)
			{
				System.out.println("shamboo");
			}
		}else
		if(num%2!=0)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.println("govinda");
			}
		}else
		{
			System.out.println("invalid input");
		}
	}
}