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
        List<Integer> lotsofints = new ArrayList<Integer>();
        for(int i=0; i < 1000000; i ++) {
            lotsofints.add(i);
        }
        lotsofints.stream().parallel().forEach(
                (n) -> System.out.println(String.format("Thread-exec %d %s", n, Thread.currentThread().getName()))
        );
    }
}
