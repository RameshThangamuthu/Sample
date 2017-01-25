package  com.mkyong.web.controller;
mport org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Assert;
import org.junit.Test;
//import org.junit.*;

public class ATestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestDocker.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
} 
