package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range{
	private int lower;
	private int upper;
	
	IntegerRange(int lower, int upper) {
		this.lower = lower;
		this.upper = upper;
		
}
	
	public int getMax() {
		return upper;
	}
	
	public int getMin() {
		return lower;
	}
	public boolean contains(int value) {
		if (getMin() <= value && value <= getMax()) {
 			return true;
 		}
 		else {
 			return false;
 		}
	}
	
	public boolean overlaps(Range other) throws EmptyRangeException {
		if (other == null) {
 			throw new EmptyRangeException("There isn't a range.");
 		}
 		else {
 			if (getMin() >= other.getMin() && (getMax() <= other.getMax() || getMax() >= other.getMax())) {
 				if (getMin() > other.getMax()) {
 					return false;
 				}
 				return true;
 			}
 			else if (getMin() <= other.getMin() && (getMax() <= other.getMax() || getMax() >= other.getMax())) {
 				if (other.getMin() > getMax()) {
 					return false;
 				}
 				return true;
 			}
 			else {
 				return false;
 			}
 		}
 	}
	
	public int size() {
		return getMax() - getMin();
	}

 }