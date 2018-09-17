package imperative;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Arthur
 */
public class PerfectNumber {
    public enum STATE{DEFICIENT, PERFECT, ABUNDANT}
    
    public static Set<Integer> divisors(int n){
        if (n<1) throw new IllegalArgumentException();
        
        return IntStream.rangeClosed(1, (int)Math.sqrt(n))
                .filter((i)->n%i==0)
                .collect(HashSet::new, 
                        (set, i)->{
                            set.add(i);
                            set.add(n/i);
                        }, 
                        HashSet::addAll);
    }
    
    public static STATE process(int n){
        return Stream.concat
                    (Stream.of(0), divisors(n).stream())
                .filter((i)->i!=n)
                .reduce((a, b)->a+b)
                .map((sum)->{
                    switch((int)Math.signum(sum-n)){
                        case -1:
                            return STATE.DEFICIENT;
                        case 1:
                            return STATE.ABUNDANT;
                        case 0:
                        default:
                            return STATE.PERFECT;
                    }
                }).get();
    }
    
    public static STATE detect(int n){
        return process(n);
    }
}
