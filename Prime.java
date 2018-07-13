class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=2;
		int a=10;
		for(i=2;i<a;i++){
			if(a%i!=0){
				System.out.println("Given number is prime number");
			}
			else{
				System.out.println("Given number is not a prime number");
			}
		}
	}
}
