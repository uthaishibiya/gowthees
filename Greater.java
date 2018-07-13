class Greater
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=12;
		int b=13;
		int c=14;
		if(a>b && a>c){
			System.out.println("a is largest number");
		}
		else if(b>a && b>c){
			System.out.println("b is greater number");
		}
		else{
			System.out.println("c is greater number");
		}
	}
}
