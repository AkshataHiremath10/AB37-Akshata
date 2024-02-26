package collect_functions;

import java.util.Collections;
import java.util.LinkedHashSet;

/* WAP to check whether LinkedHashSet class accept indexing,Duplicate,Heterogeneous,
Null,Dynamic,Sort */ 
/* LinkedHashSet accepts  Heterogeneous,Null 
    and doesn't accept indexing,Duplicate,Dynamic,Sort    */

public class Assignment_104{

public static void main(String[] args) {
	LinkedHashSet a3 = new LinkedHashSet();
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