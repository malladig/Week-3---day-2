package day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> l= new ArrayList<String>();
       l.add("aaa");
       l.add("bbb");
       l.add("aaa");
       l.add("acs");
       System.out.println(l.toString());
       Set<String> s=new LinkedHashSet<String>(l);
       
       System.out.println("After remiving duplicates the string is"+s);
       

}
}

	
