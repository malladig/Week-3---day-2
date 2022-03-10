package day2;
import java.util.*;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List <Integer> obj = new ArrayList <Integer>();
		 int count=0;
		 for(int i=0;i<=100;i++) {
			 obj.add(i);
			 }
		 obj.remove(45);
		 for(Integer i:obj) {
			 if(i != count) {
				 System.out.println(count);
				 count++;
			 }
			 count++;
		 }
		 
		 
					 
				 }
				 
			 
		 
		 
		


	}



