package howard.edu.lsp.finalproblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	
	private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>> ();
	
	public void addSong(String genre, String songTitle) {
		  HashSet<String> album = map.get(genre);
	        if (album == null) {
	            album = new HashSet<String>();
	            map.put(genre, album);
	        }
	        album.add(songTitle);
	}
	 
	public Set<String> getSongs(String genre) {
		if (map.containsKey(genre)) {
			return new HashSet<String>(map.get(genre));
		} else {
			return new HashSet<String>();
		}
	}
	
	public String getGenreOfSong(String songTitle) {
		 for (String genre : map.keySet()) {
	            HashSet<String> album = map.get(genre);
	            if (album.contains(songTitle)) {
	                return genre;
	            }
	        }
		return songTitle;
	     
	}
		
}
		
		
	

