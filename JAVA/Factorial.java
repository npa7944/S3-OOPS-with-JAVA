public class FactorialOfANumber {
public static void main(String[] args) {
	int n=6;
	int fact=1;
  for(int i=1;i<=n;i++)
  {
	  fact*=i;
  }
  System.out.println("Factorial of number is "+fact);
}
}
