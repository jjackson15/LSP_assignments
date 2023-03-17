package org.howard.edu.lsp.midterm.problem51;

public interface Range {
	
	public boolean contains(int value);
	
	public class EmptyRangeException extends Exception {
		public EmptyRangeException(String error) {
		super(error);
	}
	}
		
	public boolean overlaps(Range other) throws EmptyRangeException;
	
	public int size();
	
	public int getMax();
	
	public int getMin();
	
	}