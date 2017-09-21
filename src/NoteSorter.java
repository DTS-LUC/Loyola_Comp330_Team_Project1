import java.util.regex.*;
import java.util.*;

public class NoteSorter{

	public sortMentions TreeMap<String,ArrayList<String>>(TreeMap<String,ArrayList<String>> files){
		// Key: @identifier Value: fileName
		TreeMap<String,ArrayList<String>> mentions = new TreeMap<String,ArrayList<String>>(); // '@'
		// Iterate through text files
		// For each file run regexChecker to get identifiers
			// Check to see if key already exists
					/*True: Copy value to temp list; Add to list;
										put key with new value*/
					//False: Add key value pair
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

		for(String m:matches) {
			System.out.println(m);
		}
		System.out.println(matches);
		return matches;
	}
}
