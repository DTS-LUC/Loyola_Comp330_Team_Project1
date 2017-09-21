import java.util.regex.*;
import java.util.*;

public class NoteSorter{

	public TreeMap<String,ArrayList<String>> sortMentions(HashMap<String,String> files){
		// TreeMap store list of all mentions
		// Key: @identifier Value: fileName(s);
		// Key: String			Value: Arraylist to dynamically add Strings
		TreeMap<String,ArrayList<String>> mentions = new TreeMap<String,ArrayList<String>>(); // '@'

		HashSet<String> mentionKeys = new HashSet<String>();

		ArrayList<String> tempList;
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
					tempList = new ArrayList<String>();
					tempList = mentions.get(m);
					tempList.add(fileName);
					mentions.put(m, tempList);
					// System.out.println(tempList);
				}
				else {
					// False: Add key - value
					tempList = new ArrayList<String>();
					tempList.add(fileName);
					mentions.put(m, tempList);
					// System.out.println(mentions);
				}
			}
		}

		return mentions;
	}

	public static HashSet<String> regexChecker(String theRegex, String str2Check){

		HashSet<String> matches = new HashSet<String>();

		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		// System.out.println("Checking: " + fileName);
		while(regexMatcher.find()){
			if (regexMatcher.group().length() != 0) {
				matches.add(regexMatcher.group().trim());
			}
		}
		// for(String m:matches) {
		// 	System.out.println(m);
		// }
		// System.out.println(matches + " Regex Checker");
		return matches;
	}
}
