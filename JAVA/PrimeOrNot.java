public class PrimeNumber {
public static void main(String[] args){
	int n=7;
	boolean flag=false;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
          flag=true;
          break;
		}
 }
	if(flag!=true)
	{
		System.out.println(n+" is Prime Number");
	}
	else
	{
		System.out.println(n+" is not Prime Number");
	}
}
}