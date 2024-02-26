package collect_functions;

import java.util.Collections;
import java.util.Vector;

/* WAP to check whether Vector class accept indexing,Duplicate,Heterogeneous,
    Null,Dynamic,Sort */
//Vector accepts indexing,Duplicate,Heterogeneous,Null,Dynamic,Sort 

public class Assignment_99 {

	public static void main(String[] args) {
		Vector a1 = new Vector();
		a1.add("Apple");
		a1.add("Ball");
		a1.add('R');
		a1.add('A'); 
	    a1.add('A');   // Duplicate
		a1.add(18);
		a1.add(true);
		a1.add('a');   
		a1.add(18);
	    a1.add(null);
	    a1.add(null);
		a1.add(null);// Null  
	//  Collections.sort(a1); // sorting
		System.out.println(a1);

	}
}
