package org.howard.edu.lsp.assignment4;
/**
 * Tests and runs the code in the IntegerSet class.
 * @author jennaijackson
 *
 */
public class Driver {
/**
 * Tests and returns the code in the IntegerSet class.
 * @param args the values sent to the functions when called
 * @throws IntegerSetException if the set is empty when the largest and smallest method are called.
 */
	public static void main(String[] args) throws IntegerSetException {
		Integer_Set set1 = new Integer_Set();
		System.out.println("Value of Set1 is " + set1);
		set1.add(2);
		set1.add(36);
		set1.add(6); 
		set1.add(13);
		set1.add(24);
		set1.add(2);
		set1.add(17);
		System.out.println("Value of Set1 is: " + set1.toString());
		set1.remove(24);
		System.out.println("Set 1 after the value 24 is removed: " + set1);
		System.out.println("Length of Set1 is: " + set1.length());
		System.out.println("Set1 contains the value 36: " + set1.contains(36) + "\n");

		Integer_Set set2 = new Integer_Set();
		System.out.println("Value of Set2 is: " + set2.toString());
		set2.add(36);  
		set2.add(4);
		set2.add(24);
		set2.add(13);
		set2.add(47);
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Largest value in Set2 is: " + set2.largest());
		System.out.println("Set2 contains the value 50: " + set2.contains(50));
		System.out.println("Set2 is empty: " + set2.isEmpty() + "\n");
		
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Set1 and Set2 are equal: " + set1.equals(set2));
		System.out.println("The intersection of Set1 and Set2 is: " + ((Integer_Set) set1).intersect( set1, set2));
		System.out.println("The difference of Set1 and Set2 is: " + set1.difference(set2) + "\n");
		
		Integer_Set set3 = new Integer_Set();
		System.out.println("Value of Set3 is: " + set3.toString());
		set3.add(36);
		set3.add(4);
		set3.add(24);
		set3.add(13);
		set3.add(47);
		System.out.println("Value of Set3 is: " + set3.toString());
		System.out.println("Smallest value in Set3 is: " + set3.smallest() + "\n");
		
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set3 is: " + set3.toString());
		System.out.println("The union of Set1 and Set3 is: " + set1.union(set3) + "\n");
		
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Value of Set3 is: " + set3.toString());
		System.out.println("Set2 and Set3 are equal: " + set2.equals(set3) + "\n");
		
		System.out.println("Value of Set1 after clearing: " + set1.clear());
		System.out.println("Set1 is empty: " + set1.isEmpty());
		System.out.println("Largest value of Set1 is: " + set1.largest());
		System.out.println("Smallest value of Set1 is: " + set1.smallest());
	}




}
