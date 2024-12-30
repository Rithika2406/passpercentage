class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int x=S.nextInt();
		    int y=S.nextInt();
		    int z=S.nextInt();
		    int a=x*y;
		    double b=((double)z/a)*100;
		    if(b>50)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
