class AmstrongNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=125;
		int b,n=125,s=0,count=0;
		a=n;
		
		while(a>0){
			a=a/10;
			count++;
		}
		while(n>0){
			b=n%10;
			s=(int)(s+Math.pow(b,count));
			n=n/10;
			
			
		}
		if(s==a){
			System.out.println("Given number is amstrong number");
		}
		else{
			System.out.println("Given number is not an amstrong number");
		}
			
	}
}
