package collect_functions;

import java.util.Collections;
import java.util.PriorityQueue;

/* WAP to check whether PriorityQueue class accept indexing,Duplicate,Heterogeneous,
   Null,Dynamic,Sort */
/* PriorityQueue accepts Duplicate,Dynamic and 
   doesn't accept indexing,Heterogeneous,Null and Sort*/

public class Assignment_101 {

public static void main(String[] args) {
    PriorityQueue a3 = new PriorityQueue();
	a3.add("Apple");
	a3.add("Cat");
	a3.add("Bat");
	a3.add("Apple");
	a3.add("Dog");
	a3.add("Apple"); 
 /*  a3.add('A');  
	a3.add(18);
	a3.add(true);
	a3.add('A');   //Duplicate
	a3.add(19);   
   a3.add(null);
   a3.add(null);  
   a3.add(null);  // Null  */
   //Collections.sort(a3); // sorting
	
	System.out.println(a3);

}
}
