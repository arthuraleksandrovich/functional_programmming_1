/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imperative;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 *
 * @author Arthur
 */
public class mClass {
    public static void main(String args[]){
        Result result=JUnitCore.runClasses(PerfectNumberTest.class);
        
        result.getFailures().forEach(System.out::println);
        
        System.out.println("Success: "+result.wasSuccessful());
        System.out.println("Run count: "+result.getRunCount());
    }
}
