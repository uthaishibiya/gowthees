class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,s=0,t;
		int n=454;
		t=n;
		while(n>0){
			a=n%10;
			s=(s*10)+a;
			n=n/10;
		}
		if(t==s){
			System.out.println("Given number is palindrone");
		}
		else{
			System.out.println("Given number is not a palindrome");
		}
	}
}
