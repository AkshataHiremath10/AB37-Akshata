package collect_functions;

import java.util.Collections;
import java.util.HashSet;

/* WAP to check whether HashSet class accept indexing,Duplicate,Heterogeneous,
Null,Dynamic,Sort */
/* HashSet accepts Heterogeneous,Null and 
   doesn't accept indexing,Duplicate,Dynamic,Sort  */

public class Assignment_103{

public static void main(String[] args) {
	HashSet a3 = new HashSet();
	a3.add("Apple");
	a3.add("Cat");
	a3.add("Bat");
	a3.add("Dog");
	a3.add("Apple");  
    a3.add('A');  
	a3.add(18);
	a3.add(true);
	a3.add('A');   //Duplicate
	a3.add(19);
    a3.add(null);  // Null  
   //Collections.sort(a3); // sorting
	System.out.println(a3);

}
}
