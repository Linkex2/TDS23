
public class CountDo {
	public static void main(String[] args)
	{
		int num = 233;
		
		do
		{
			System.out.println(num);
			if(num >= 300 && num <= 400)
			{
				num = num + 3;
			}
			else
			{
				num = num + 5;
			}
		}
		while(num <= 456);
	}
}
