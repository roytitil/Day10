package com.acc.lkm.day10.lkm_day10_activity1;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
 public class activity1 {
	 public static void main(String[] args) {
		 List<String>technology = new ArrayList<String>();
		 technology.add("Python");
		 technology.add("Java");
		 technology.add("Asp.Net");
		 technology.add("Salesforce");
		 technology.add("Generative AI");
		 
		 System.out.println("Original List:");
		 for(String str1 : technology) {
		 System.out.println(str1);
}

		 Collections.sort(technology,(t1,t2) -> t1.compareTo(t2));

		 System.out.println("\nSorted List:");
		 for(String str2 : technology) {
		 System.out.println(str2);
}
}
}