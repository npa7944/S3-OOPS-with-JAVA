public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20, t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series of first " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(t1 + " ");

            int s= t1 + t2;
            t1 = t2;
            t2 = s;
        }
    }
}