import java.util.regex.*;
import java.util.*;

public class NoteSorter{

	public sortMentions TreeMap<String,ArrayList<String>>(TreeMap<String,String> files){
		// TreeMap store list of all mentions
		// Key: @identifier Value: fileName(s);
		// Key: String			Value: Arraylist to dynamically add Strings
		TreeMap<String,ArrayList<String>> mentions = new TreeMap<String,ArrayList<String>>(); // '@'

		ArrayList<String> mentionKeys = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();

		String fileName;
		// Loop through files
		for(Map.Entry<String,String> file : files.entrySet()) {
  		fileName = file.getKey();
			//Get all mentions from the file text with regexChecker
			mentionKeys = regexChecker("@[a-zA-Z_][0-9a-zA-Z_]*", file.getValue());
			// Add mention keys to mentions TreeMap
			for(String m:mentionKeys) {
				// check if value exists
				if (mentions.containsKey(m)){
					// True: Add to ArrayList
					temp = mentions.get(m);
					temp.add(fileName);
					mentions.put(m, temp);
				}
				else {
					// False: Add key value
					temp.add(fileName);
					mentions.put(m, temp);
				}
				temp.clear();
			}
		}

		return mentions;
	}

	public static ArrayList<String> regexChecker(String theRegex, String str2Check){

		ArrayList<String> matches = new ArrayList<String>();

		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);

		while(regexMatcher.find()){
			if (regexMatcher.group().length() != 0) {
				matches.add(regexMatcher.group().trim());
			}
		}
		// for(String m:matches) {
		// 	System.out.println(m);
		// }
		// System.out.println(matches);
		return matches;
	}
}
