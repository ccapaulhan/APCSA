package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	  
	//test reading from files
	//read in the positive adjectives in postiveAdjectives.txt
	
	System.out.println(Review.sentimentVal("crossing"));
	System.out.println(Review.sentimentVal("logic"));
	System.out.println(Review.sentimentVal("lone"));

	System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
	
	System.out.println(Review.totalSentiment("src/ConsumerLab/26WestReview.txt"));

	System.out.println(Review.fakeReview("src/ConsumerLab/26WestReview2.txt"));
	System.out.println(Review.fakePositiveReview("src/ConsumerLab/26WestReview2.txt"));
	System.out.println(Review.fakeNegativeReview("src/ConsumerLab/26WestReview2.txt"));

  }
}