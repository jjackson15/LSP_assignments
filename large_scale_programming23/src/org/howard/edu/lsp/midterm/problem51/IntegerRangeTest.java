package org.howard.edu.lsp.midterm.problem51;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.midterm.problem51.Range.EmptyRangeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerRangeTest {
	 	IntegerRange int_range;

	 	@BeforeEach
	 	void setUp() throws Exception {
	 		int_range = new IntegerRange(0, 50);
	 	}
	 	
	 	@Test
	 	@DisplayName("Test for getMax")
	 	void testGeMax() {
	 		assertEquals(int_range.getMax(), 50);
	 		assertFalse(int_range.getMax() == 51);
	 	}

	 	@Test
	 	@DisplayName("Test for getMin")
	 	void testGetMin() {
	 		assertEquals(int_range.getMin(), 0);
	 		assertFalse(int_range.getMin() == 1);

	 	}

	 	@Test
	 	@DisplayName("Test for contains")
	 	void testContains() {
	 		assertTrue(int_range.contains(35));
	 		assertTrue(int_range.contains(49));
	 		assertFalse(int_range.contains(51));
	 		assertFalse(int_range.contains(100));
	 	}

	 	@Test
	 	@DisplayName("Test for overlaps")
	 	void testOverlaps() throws EmptyRangeException {
	 		IntegerRange range;

	 		range = new IntegerRange(35, 50);
	 		assertTrue(int_range.overlaps(range));
	 		assertTrue(range.overlaps(int_range));

	 		range = new IntegerRange(49, 100);
	 		assertTrue(int_range.overlaps(range));
	 		assertTrue(range.overlaps(int_range));

	 		range = new IntegerRange(51, 100);
	 		assertFalse(int_range.overlaps(range));
	 		assertFalse(range.overlaps(int_range));
	 	}

	 	@Test
	 	@DisplayName("Test for EmptyRangeException")
	 	void testOverlapsException() {
	 		IntegerRange range = null;

	 		assertThrows(EmptyRangeException.class, () -> int_range.overlaps(range));
	 	}

	 	@Test
	 	@DisplayName("Test for size")
	 	void testSize() {
	 		IntegerRange range;

	 		range = new IntegerRange(34, 50);
	 		assertEquals(range.size(), 16);

	 		range = new IntegerRange(72, 150);
	 		assertEquals(range.size(), 78);

	 		assertEquals(int_range.size(), 50);
	 	}
	 	
	 	@AfterEach
	 	void tearDown() throws Exception {
	 		int_range = null;
	 	}
}
