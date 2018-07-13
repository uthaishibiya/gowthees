class Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=1;
		int n=6;
		for(i=1;i<=n;i++){
			if((n&1)==0){
				System.out.println(n);
			}
		}
	}
}
