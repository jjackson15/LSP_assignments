package howard.edu.lsp.finalproblem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SongsDatabaseTest {
	private SongsDatabase album;

	@BeforeEach
	void setUp() {
		album = new SongsDatabase();
		album.addSong("Pop", "Umbrella");
		album.addSong("Pop", "Levitating");
		album.addSong("Country", "Fancy");
		album.addSong("Country", "Dont you wanna stay");	
	}
	
	@Test
	@DisplayName("Test for addSong")
	public void testAddSong() {		
		Set<String> RapSongs = album.getSongs("Rap");
		Set<String> RandB = album.getSongs("R&B");
		
		assertEquals(RapSongs.size(), 0);
		assertEquals(RandB.size(), 0);
		
		album.addSong("Rap", "Twin");
		album.addSong("Rap", "First Class");
		album.addSong("R&B", "The Boy Is Mine");
		album.addSong("R&B", "Waterfalls");	
		
		assertEquals(album.getSongs("Rap").size(), 2);
		assertEquals(album.getSongs("R&B").size(), 2);

		System.out.println(album.getSongs("R&B"));
	}
	
	@Test
	@DisplayName("Test for getSongs")
	public void testGetSongs() {
		Set<String> Country = album.getSongs("Country");
		Set<String> Pop = album.getSongs("Pop");
		
		assertEquals(Pop.size(), 2);
		assertTrue(Country.contains("Fancy"));
		assertTrue(Pop.contains("Umbrella"));	
		assertFalse(Pop.contains("First Class"));
		
	}
	
	@Test
	@DisplayName("Test for getGenreOfSong")
	public void testGetGenreOfSong() {
		assertEquals(album.getGenreOfSong("Umbrella"), "Pop");
		assertEquals(album.getGenreOfSong("Levitating"), "Pop");
		System.out.println(album.getGenreOfSong("Fancy"));
	}
	
	@AfterEach
	void tearDown() {
		SongsDatabase album = null;
	}
}
