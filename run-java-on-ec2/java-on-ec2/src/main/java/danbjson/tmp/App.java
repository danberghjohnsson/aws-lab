package danbjson.tmp;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        long start = System.currentTimeMillis();
        List<Integer> lotsofints = new ArrayList<Integer>();
        for(int i=2; i < 300000; i ++) {
            lotsofints.add(i);
        }
        lotsofints.stream().forEach(
                (n) -> {
                    boolean prime = isPrime(n);
                    System.out.println(String.format("Thread-exec %d %b %s", n, prime, Thread.currentThread().getName()));
                }
        );
        long stop = System.currentTimeMillis();
        System.out.println(String.format("Total time (s): %d", (stop-start) / 1000));
    }


    private static boolean isPrime(long largenumber) {
        boolean hasDivisor = false;
        for(int n=2; n<largenumber && !hasDivisor; n++ ) {
          if(largenumber % n == 0) hasDivisor = true;
        }
        return !hasDivisor;

    }

    private static long fib(int n) {
        long result;
        switch (n) {
            case 0 : result = 1; break;
            case 1 : result = 1; break;
            default:
                result = fib(n - 2) + fib(n - 1);
                break;
        }
        return result;
    }
}
