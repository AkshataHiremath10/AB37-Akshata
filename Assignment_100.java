package collect_functions;

import java.util.Collections;
import java.util.LinkedList;

/* WAP to check whether LinkedList class accept indexing,Duplicate,Heterogeneous,
Null,Dynamic,Sort */
//LinkedList accepts indexing,Duplicate,Heterogeneous,Null,Dynamic,Sort 

public class Assignment_100 {

public static void main(String[] args) {
	 LinkedList a2 = new LinkedList();
	a2.add("Apple");
	a2.add("Cat");
	a2.add("Bat");
	a2.add("Dog");
	a2.add("Bat");
	 a2.add('A');  
	a2.add(18);
	a2.add(true);
	a2.add('A');   //Duplicate
	a2.add(19);
    a2.add(null);
    a2.add(null);
	a2.add(null);// Null  
   // Collections.sort(a2); // sorting
	System.out.println(a2);

}
}
