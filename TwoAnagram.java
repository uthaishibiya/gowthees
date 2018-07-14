class TwoAnagram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=150;
		int b=160;
		int i;
		int n=160;
		int count=0;
		int c=n;
		int s=0;
		for(i=150+1;i<160;i++){
			while(n!=0){
				n=n/10;
				count++;
			}
			n=i;
			while(n!=0){
				s=n%10;
				s=(int)(s+(Math.pow(s,count)));
				n=n/10;
			}
		}
		if(s==c){
			System.out.println(c+" ");
		}
	}
}
