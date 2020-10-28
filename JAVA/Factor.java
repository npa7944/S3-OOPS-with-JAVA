public class FactorOfNumber {
public static void main(String[] args) {
int n=30;
System.out.println("Factor Of " +n);
for(int i=1;i<=n;i++) {
	if(n%i==0)
		System.out.println(i+" ");
}
}
}