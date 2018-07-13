class LeapYear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=2012;
		if(a%4==0 && a%100!=0 && a%400==0){
			System.out.println("given year is leap year");
		}
		else{
			System.out.println("given year is not a leap year");
		}
	}
}
