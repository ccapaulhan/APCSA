/*
 Represents information about a NWS weather station
*/
package DataLab;
public class School {
   private String name;
   private int testTakers;
   private int read;
   private int math;
   private int writing;
   
   School(String name, int testTakers, int read, int math, int writing) {
      this.name = name;
      this.testTakers = testTakers;
      this.read = read;
      this.math = math;
      this.writing = writing;   
   }
   
   public int getRead() { 
      return read;
   }
   public int getMath() { 
	      return math;
   }
	   
   public int getWriting() { 
	      return writing;
   }
	   
   
   public String getName() { 
      return name;
   }
   
   public double meanScore() {
	   int sum = read + math + writing;
	   return sum/3;
   }
   
   
   public String toString() {
	   return name;
   }
  
 
   
}