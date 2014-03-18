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
            lotsofints.add(new Integer(i));
        }
        lotsofints.stream().parallel().forEach((t) -> System.out.println(Thread.currentThread().getName() + " " + t));
    }
}
