package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> set1 = new HashSet <String>();
		HashSet <String> set2 = new HashSet <String>();
		
		 set1.add("Mon");
		 set1.add("tue");
		 set1.add("fri");
		 set1.add("wed");
		 set2.add("fri");
		 set2.add("sun");
		 set2.add("tue");
		 set2.add("thu");
		 set1.retainAll(set2);
		 System.out.println("intersection is"+set1);
	
	}
}


