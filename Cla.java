class CLAexamp {
	public static int factorial(int n)
	{
		int prod=1;
		if(n==0 || n==1)
		{
			return n;
		}
		else
		{
			for(int i=2;i<=n;i++)
			{
				prod*=i;
			}
		}
		return prod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length==1)
		{
			int n= Integer.parseInt(args[0]);
			System.out.println(factorial(n));
		}
		else if(args.length==2)
		{
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			int absDiff= Math.abs(n2-n1);
			System.out.println(absDiff);
		}
		else
		{
			System.out.println("Invalid , Error");
		}

	}

}