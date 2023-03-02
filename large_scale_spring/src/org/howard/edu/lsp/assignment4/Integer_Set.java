package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This class performs different operations on a set of integers such as finding the largest or smallest value,
 * the length of the set, if the set contains a value, if two sets are equal, the union of two sets, the intersection of two 
 * sets, the difference of two sets, or if a set is empty. The class also adds to a set, clears from a set, removes 
 * from a set, and converts the set to a string.
 * @author jennaijackson
 */
public class Integer_Set {
	private List<Integer> set;
	/**
	 * Creates a list of integers under a variable: set.
	 */
	public Integer_Set() {
		set = new ArrayList<Integer>();
	}
	/**
	 * Clears the values from n integer set.
	 * @return the empty set
	 */
	public List<Integer> clear() {
		set.clear();
		return set; 
	}
	/**
	 * Gets the length of a set.
	 * @return the length of a set
	 */
	public int length() {
		Integer len_of_set = set.size();
		return len_of_set;
	} 
	/**
	 * Determines if two sets are equal.
	 * @param setA (the integer set that is going to be compared to a set)
	 * @return true if the sets are equal or false if the two sets are not equal
	 */
	public boolean equals(Integer_Set setA) {
		for (int i = 0; i < set.size() +1;) {
			if (set.get(i) == setA.set.get(i)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	/**
	 * Determines if a set contains the given value.
	 * @param value (the integer value that may or may not be in the set)
	 * @return true if the set contains the value or false if the set does not contain the value
	 */
	public boolean contains(int value) {
		boolean contains = set.contains(value);
		return contains;
		}
	/**
	 * Determines the largest value in a set.
	 * @return the largest value in a set
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException {
		if (set.size() == 0)
			throw new IntegerSetException("This set is empty. It does not have a largest value.");
		Integer maximum = Collections.max(set);
		return maximum;
	}
	/**
	 * Determines the smallest value in a set.
	 * @return the smallest value in a set
	 * @throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException {
		if (set.size() == 0)
			throw new IntegerSetException("This set is empty. It does not have a smallest value.");
		Integer minimum = Collections.min(set);
		return minimum;
	}
	/**
	 * Adds a value to a set if the value isn't already in the set.
	 * @param item (the integer value that will be added to a set)
	 */
	public void add(int item) {
		if (!set.contains(item))
			set.add(item);
	}
	/**
	 * Removes a value from a set if the given value is in the set.
	 * @param item (the integer value in the set that needs to be removed)
	 */
	public void remove(int item) {
		for (int i = 0; i < set.size(); i++)
			if (set.get(i) == item)
				set.remove(i);
	}
	/**
	 * Finds the intersection of two sets which are the values that are in both sets.
	 * @param set1 (the integer set being compared to set2)
	 * @param set2(the integer set being compared to set1)
	 * @return setA (the integer set that is the intersection of set1 and set2)
	 */
	public Integer_Set intersect(Integer_Set set1, Integer_Set set2) {
		Integer_Set setA = new Integer_Set();
		for (int i = 0; i < set2.set.size() -1; i++)
			if (set1.contains(set2.set.get(i)))
				setA.add(set2.set.get(i));
		return setA;
	}
	/**
	 * Finds the union of two sets which are all of the value in both sets.
	 * @param intSetb (the integer set being compared to a set)
	 * @return setB (the integer set that is the union of a set and the given set)
	 */
	public Integer_Set union(Integer_Set intSetb) {
		Integer_Set setB = new Integer_Set();
		for (int i = 0; i < intSetb.set.size(); i++)
			setB.add(intSetb.set.get(i));
		for (int j = 0; j < intSetb.set.size(); j++)
			setB.add(set.get(j));
		return setB;
	}
	/**
	 * Finds the difference of two sets which are the values that are in one set, but not in the other.
	 * @param intSetb (the integer set that will be compared to a set)
	 * @return setC (the integer set that is the difference of a set and the given set)
	 */
	public Integer_Set difference(Integer_Set intSetb) {
		Integer_Set setC = new Integer_Set();
		for (int i = 0; i < set.size(); i++ )
			if (!intSetb.set.contains(set.get(i)))
				setC.add(set.get(i));
		for (int j = 0; j < set.size(); j++ )
			if (!set.contains(intSetb.set.get(j)))
				setC.add(intSetb.set.get(j));
		return setC;	
	}
	/**
	 * Determines if a set is empty.
	 * @return true if the set is empty or false if the set is not empty.
	 */
	boolean isEmpty() {
		boolean empty = set.isEmpty();
		return empty;
	}
	/**
	 * Creates a string representation of a integer set
	 * @return a string representation of the set
	 */
	public String toString() {
		String result = set.toString();
		return result;
	}
}
