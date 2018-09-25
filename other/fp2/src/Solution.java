
import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Solution {
    public static long superDigit(long X){
        if (X<10) return X;
        return superDigit(X%10 + superDigit(X/10));
    }
    
    public static int powerSum(int X, int N){
        if (X<0 || N<1) throw new IllegalArgumentException();
        
        return powerSumRecursive(X
                               , (int)(Math.pow(X, 1.0/N)+1)
                               , N);
    }
    
    //M - maximal number
    private static int powerSumRecursive(int X, int M, int N){
        if (X<0) return 0;
        if (X==0) return 1;
        return IntStream
                .rangeClosed(1, M)
                .map((i)->powerSumRecursive(X-(int)Math.pow(i, N), i-1, N))
                .reduce(0, (i, j)->i+j);
    }
}
