public class PalindromeOrNot {
public static void main(String[] args) {
        int num = 121, rev= 0, rem, a;
        a = num;
        while( num != 0 )
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num  /= 10;
        }

        if (a == rev)
            System.out.println(a + " is a palindrome.");
        else
            System.out.println(a + " is not a palindrome.");
    }
}