package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import java.util.Map.Entry;


public class FileReader {
	public String readToString(String resource) throws FileNotFoundException {
		URL url = getClass().getClassLoader().getResource(resource);
		
		if (url != null) {
			File file = new File(url.getPath());
			
			Scanner sc = null;
			try {
				sc = new Scanner(file);
				String output = "";
				while (sc.hasNextLine()) {
					output = output + sc.nextLine() + " ";
				}
		
				return output.trim();
			} finally {
				sc.close();
			}
		}
		throw new FileNotFoundException();
	}



	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		final String String = null;
		String new_string = "";
		String lowercase = "";
		String string1 = "";
		Map<String, Integer> word_count = new HashMap<String, Integer>();
		List<String> x = new ArrayList<String>();

	//	
//		FileReader fileReader = new FileReader();
//		String paragraph = fileReader.readToString("main/java/resources/words.txt"));
			
//		String paragraph = "A random paragraph can also be an excellent way for a writer to tackle writers' block. Writing block can often happen due  10000 to being stuck with a current project that the writer is trying to complete. By inserting a completely random paragraph from which to begin, it can take down some of the issues that may have been causing the writers' block in the first place.";
		//takes in a body of text, converts to lower case, removes digits 
		FileReader fileReader = new FileReader();
		String paragraph = fileReader.readToString("main/java/resources/words.txt");
		lowercase = (paragraph.toLowerCase());
		string1 = lowercase.replaceAll("\\p{Punct}", "");
		new_string = string1.replaceAll("\\d", "");
		
		//converts string into a list of strings
		List<String> x1 = Arrays.asList(new_string.split(" "));
	//	System.out.println(x1);
		
		for (int i = 0; i < x1.size(); i++) {
			String word = x1.get(i);
			int len_of_word = ((String) word).length();
			if (len_of_word > 3 && (word_count.get(word) == null)) {
				word_count.put(word, 1);
			}	else if (len_of_word > 3 && (word_count.containsKey(word))) {
					int count = word_count.get(word);
							word_count.put(word, count + 1);
				}
				
		}
		
		for (Map.Entry<String, Integer> mapElement : word_count.entrySet()) {
			String key = mapElement.getKey();
			int value = (mapElement.getValue());
		System.out.println(key + ":" + value);
		}
	}
	}
	
	


	



