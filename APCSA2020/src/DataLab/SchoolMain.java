/*
 * Arrays of objects
 */
package DataLab;

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/zt9s-n5aj/rows.xml").load();
      ArrayList<School> allSchools = ds.fetchList(School.class, "row/row/school_name", 
             "row/row/number_of_test_takers", "row/row/critical_reading_mean",
             "row/row/mathematics_mean", "row/row/writing_mean");
      System.out.println("Total schools: " + allSchools.size());
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Do you want to know which school in New York is smartest?");
      String next = sc.next();
      if (next.equals("y")) {
    	  double highestMean = 0;
    	  School bestSchool = null;
    	  for (School school : allSchools) {
    		  if (school.meanScore() > highestMean) {
    			  bestSchool = school;
    			  highestMean = school.meanScore();
    		  }
    	  }
    	  System.out.println("The best school is " + bestSchool.getName() + " with a mean score of " + highestMean);
      }
     
   }
}

