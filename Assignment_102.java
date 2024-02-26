package collect_functions;

import java.util.Collections;
import java.util.TreeSet;

/* WAP to check whether TreeSet class accept indexing,Duplicate,Heterogeneous,
Null,Dynamic,Sort */
/* TreeSet Doesn't accepts indexing,Duplicate,Heterogeneous,Null,Dynamic,Sort */

public class Assignment_102 {

public static void main(String[] args) {
	TreeSet a3 = new TreeSet();
	a3.add("Apple");
	a3.add("Cat");
	a3.add("Bat");
	a3.add("Dog");
	a3.add("Apple");  
  /*  a3.add('A');  
	a3.add(18);
	a3.add(true);
	a3.add('A');   //Duplicate
	a3.add(19);   
    a3.add(null);  // Null  
	a3.add(null);
	a3.add(null);  */
   // Collections.sort(a3); // sorting

	System.out.println(a3);

}
}
