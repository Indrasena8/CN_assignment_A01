
public class HA01G03A {
	public static void main(String args[])
	{
		String address=args[0];
		String[] split=address.split("\\.");
		try {
		int a=Integer.parseInt(split[0]);
		int b=Integer.parseInt(split[1]);
		int c=Integer.parseInt(split[2]);
		int d=Integer.parseInt(split[3]);
		if((a>0)&&((a<10)||(a>10))&&(a<240)&&(a!=127))
		{
			if((d>0)&&(d<256))
			{
				if((b>=0)&&(b<256))
				{
					if((c>=0)&&(c<256))
					{
						System.out.println(address+" is Valid");
					}
					else {
						System.out.println(address+" is Invalid");
					}
				}
				else {
					System.out.println(address+" is Invalid");
				}
			}
			else {
				System.out.println(address+" is Invalid");
			}
		}
		else if(a==127)
		{
			if((b==0)&&(c==0))
			{
				if((d>0)&&(d<256))
				{
					System.out.println(address+" is Valid");
				}
				else {
					System.out.println(address+" is Invalid");
				}
			}
			else {
				System.out.println(address+" is Invalid");
			}
		}
		else {
			System.out.print(address+" is Invalid");
		}
		}
		catch(Exception e) {
			System.out.println(address+" is Invalid input");
		}
	}
}
