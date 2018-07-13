class Odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=6;
		int i=1;
		for(i=1;i<n;i++){
			if((n&1)!=0){
				System.out.println(n);
			}
		}
	}
}
