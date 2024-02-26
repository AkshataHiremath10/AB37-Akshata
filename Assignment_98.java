package collect_functions;

/* WAP to check whether ArrayList class accept indexing,Duplicate,Heterogeneous,
    Null,Dynamic,Sort */
//ArrayList accepts indexing,Duplicate,Heterogeneous,Null,Dynamic,Sort 
import java.util.ArrayList;
import java.util.Collections;

public class Assignment_98 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Aksh");   
		a.add("Vip");
		a.add("Ram");
		a.add("Aksh");           //Duplicate
		a.add(18);       
		a.add(true);
		a.add('a');
		a.add(null); 
		a.add(null);
		a.add(null);  //Null
		// Collections.sort(a);  //sorting
		System.out.println(a);

	}
}
