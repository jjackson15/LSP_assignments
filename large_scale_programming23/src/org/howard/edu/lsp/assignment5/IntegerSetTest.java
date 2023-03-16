package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	private IntegerSet integerset;
	private IntegerSet setb;
	
	@BeforeEach
	void setUp() {
		integerset = new IntegerSet();
		setb = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		integerset.add(5);
		integerset.add(7);
		assertFalse(integerset.isEmpty());
		integerset.clear();
		assertTrue(integerset.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		assertEquals(integerset.length(), 0);
		integerset.add(6);
		integerset.add(5);
		integerset.add(7);
		assertEquals(integerset.length(), 3);
	}
	
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		setb = new IntegerSet();
		integerset.add(6);
		integerset.add(5);
		integerset.add(7);
		setb.add(6);
		setb.add(5);
		setb.add(7);
		assertTrue(setb.equals(integerset));
		setb.remove(6);
		assertFalse(integerset.equals(setb));
	}
	
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		assertFalse(integerset.contains(12));
		integerset.add(12);
		integerset.add(32);
		integerset.add(20);
		assertTrue(integerset.contains(12));
	}
	
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		integerset.add(10);
		integerset.add(16);
		integerset.add(7);
		assertEquals(integerset.largest(), 16);
		integerset.clear();
		Throwable exception = assertThrows(IntegerSetException.class, () -> integerset.largest());
		assertEquals("This set is empty. It does not have a largest value.", exception.getMessage());
	}
	
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		integerset.add(3);
		integerset.add(4);
		integerset.add(9);
		assertEquals(integerset.smallest(), 3);
		integerset.clear();
		Throwable exception = assertThrows(IntegerSetException.class, () -> integerset.smallest());
		assertEquals("This set is empty. It does not have a smallest value.", exception.getMessage());
	}
	
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		assertFalse(integerset.contains(1));
		assertTrue(integerset.isEmpty());
		integerset.add(1);
		integerset.add(23);
		integerset.add(3);
		assertFalse(integerset.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		assertTrue(integerset.isEmpty());
		integerset.add(100);
		integerset.add(2);
		assertFalse(integerset.isEmpty());
		integerset.remove(100);
		integerset.remove(2);
		assertTrue(integerset.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		integerset.add(6);
		integerset.add(5);
		integerset.add(7);
		setb.add(1);
		setb.add(2);
		setb.add(3);
		IntegerSet union_set = integerset.union(setb);
		IntegerSet test_set = new IntegerSet();
		assertFalse(integerset.union(setb) == test_set);
		assertTrue(union_set.equals(integerset.union(setb)));
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		integerset.add(6);
		integerset.add(5);
		integerset.add(7);
		setb.add(5);
		setb.add(7);
		setb.add(34);
		setb.add(43);
		IntegerSet test_set = new IntegerSet();
		assertFalse(integerset.intersect(setb, integerset) == test_set);
		IntegerSet intersection = integerset.intersect(setb, integerset);
		assertTrue(intersection.equals(integerset.intersect(setb, integerset)));
	}
	
	@Test
	@DisplayName("Test case for difference")
	public void testDifference() {
		integerset.add(6);
		integerset.add(5);
		integerset.add(7);
		setb.add(5);
		setb.add(7);
		setb.add(34);
		setb.add(43);
		IntegerSet test_set = new IntegerSet();
		assertFalse(integerset.difference(setb) == test_set);
		IntegerSet differences = integerset.difference(setb);
		assertTrue(differences.equals(integerset.difference(setb)));
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		assertTrue(integerset.isEmpty());
		integerset.add(10);
		assertFalse(integerset.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		assertNotNull(integerset.toString());
		integerset.add(83);
		integerset.add(7);
		assertNotNull(integerset.toString());
	}
	
	@AfterEach
	void tearDown() {
		integerset = null;
		setb = null;
	}
}

