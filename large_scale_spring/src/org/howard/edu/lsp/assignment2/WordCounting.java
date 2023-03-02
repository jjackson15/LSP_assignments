//package org.howard.edu.lsp.assignment2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Map.Entry;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.net.URL;
//
//public class WordCounting {
//	public String readToString(String resource) throws FileNotFoundException {
//		URL url = getClass().getClassLoader().getResource(resource);
//		
//		if (url != null) {
//			File file = new File(url.getPath());
//			
//			Scanner sc = null;
//			try {
//				sc = new Scanner(file);
//				String output = "";
//				while (sc.hasNextLine()) {
//					output = output + sc.nextLine() + " ";
//				}
//		
//				return output.trim();
//			} finally {
//				sc.close();
//			}
//		}
//		throw new FileNotFoundException();
//	}
//	
//	public class CountWords {
//		
//		final String String = null;
//		static String new_string = "";
//		static String lowercase = "";
//		static String string1 = "";
//		static Map<String, Integer> word_count = new HashMap<String, Integer>();
//	 
//		static List<String> x = new ArrayList<String>();
//		
//		
//		
//		
//		public static void main(String[] args) throws FileNotFoundException {
//			
//			
//	//		FileReader fileReader = new FileReader();
//	//		String paragraph = fileReader.readToString("main/java/resources/words.txt"));
//			
//	//		String paragraph = "A random paragraph can also be an excellent way for a writer to tackle writers' block. Writing block can often happen due  10000 to being stuck with a current project that the writer is trying to complete. By inserting a completely random paragraph from which to begin, it can take down some of the issues that may have been causing the writers' block in the first place." ;
//			//takes in a body of text, converts to lower case, removes digits 
//			WordCounting fileReader = new WordCounting();
//			String paragraph = fileReader.readToString("main/java/resources/words.txt");
//			lowercase = (paragraph.toLowerCase());
//			string1 = lowercase.replaceAll("\\p{Punct}", "");
//			new_string = string1.replaceAll("\\d", "");
//			
//			//converts string into a list of strings
//			List<String> x1 = Arrays.asList(new_string.split(" "));
//	//		System.out.println(x1);
//			
//			for (int i = 0; i < x1.size(); i++) {
//				String word = x1.get(i);
//				int len_of_word = ((String) word).length();
//				if (len_of_word > 3 && (word_count.get(word) == null)) {
//					word_count.put(word, 1);
//				}	else if (len_of_word > 3 && (word_count.containsKey(word))) {
//						int count = word_count.get(word);
//								word_count.put(word, count + 1);
//					}
//					
//			}
//			
//			for (Map.Entry<String, Integer> mapElement : word_count.entrySet()) {
//				String key = mapElement.getKey();
//				int value = (mapElement.getValue());
//			System.out.println(key + ":" + value);
//			}
//			
//	
//		}
//			
//	}
//}
//
//
//
////python
////def wordcounting(string):
////	  new_string = ""
////	  lower_string = string.lower()
////	  for i in string:
////	    if not i.isnumeric():
////	      new_string += i
////	  # return new_string
////	#   print(new_string)
////	  x = new_string.split()
////	  # print(x)
////	  
////	  word_count = {}
////	  for word in x:
////	    if len(word) > 3 and word not in word_count:
////	      word_count[word] = 1
////	    elif len(word) > 3 and word in word_count:
////	      word_count[word] += 1
////	    else:
////	      continue
//
//	  
////
////	  for i in word_count:
////	    print(i, ':', word_count[i])
