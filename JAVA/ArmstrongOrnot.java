public class AmstrongOrNot {
	public static void main(String[] args) {
        int num = 371, res= 0, rem, a;
        a = num;
        while( num != 0 )
        {
            rem = num % 10;
            res = res + rem*rem*rem;
            num  /= 10;
        }

        if (a == res)
            System.out.println(a + " is a palindrome.");
        else
            System.out.println(a + " is not a palindrome.");
    }
}