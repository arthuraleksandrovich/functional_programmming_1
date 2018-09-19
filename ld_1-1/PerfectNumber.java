package imperative;
import java.util.*;

/**
 *
 * @author Arthur
 */
public class PerfectNumber {
    public enum STATE{DEFICIENT, PERFECT, ABUNDANT}
    
    public static Set<Integer> divisors(int n){
        Set<Integer> setD=new TreeSet<>();
        setD.add(n);
        
        int max=n/2;
        for (int i=1; i<=max; i++){
            if (n%i==0){
                setD.add(i);
            }
        }
        return setD;
    }
    
    public static STATE process(int n){
        int sum=0;
        for(int i: divisors(n)){
            if (i!=n){
                sum+=i;
            }
        }
        
        if (sum<n){
            return STATE.DEFICIENT;
        }else if (sum==n){
            return STATE.PERFECT;
        }else{
            return STATE.ABUNDANT;
        }
    }
    
    public static STATE detect(int n){
        return process(n);
    }
}
