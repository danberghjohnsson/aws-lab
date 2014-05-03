package danbjson.tmp;

import java.util.ArrayList;
import java.util.List;

/**
 * List primes
 */
public class App 
{

    private static final int UPPER_LIMIT = 20; //300000;

    public static void main( String[] args )
    {
        long start = System.currentTimeMillis();
        List<Integer> lotsofints = new ArrayList<Integer>();
        for(int i=2; i <
                UPPER_LIMIT; i ++) {
            lotsofints.add(i);
        }
        lotsofints.stream().forEach( // .parallel()
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

}
