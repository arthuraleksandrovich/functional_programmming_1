
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Fp2 {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println(Solution.powerSum(13, 2));
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
