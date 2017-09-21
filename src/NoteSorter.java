/*
    Be able to report of all notes containing one or more mentions
      - Search Note search by key
      - Use while loop

    Be able to report notes by mention/keywords selectively
      - search mention/keyword map

    Be able to generate a report of all notes, organized by mention
      - Create sorted map key = mention; value = notes
    Be able to generate a report of all keywords
      - Create sorted map key = keyword; value = note; iterate through getKey()
    Be able to generate a report of all notes, organized by keyword
      -  Display key-value pairs

    Report of all notes in topological order
*/
// TODO: Replace Note with TreeMaps
import java.util.regex.*;

public class NoteSorter{

  public void SortNotes(String[] files){
    // Create a sorted hash map
    TreeMap mentions = new TreeMap();
    TreeMap topics = new TreeMap();

    ArrayList<String> mentionKeys = new ArrayList<String>();
    ArrayList<String> topicKeys = new ArrayList<String>();

    // Check for '@' mentions
    mentionKeys = regexChecker("@[a-zA-Z_][0-9a-zA-Z_]*", /*file*/);
    for(String m:mentionKeys) {
          // keys match an ArrayList
          // check if value exists
          if (mentions.containsKey(m)){
            mentions.get(m).add(/*file*/);
          }
          else {
            mentions.put(m, /*file*/);
          }
          // True: Add to ArrayList
          // False: Add key value

        }

    // Check for '#' mentions
    topicKeys = regexChecker("#[a-zA-Z_][0-9a-zA-Z_]*", /*file*/);


    // Check for '!' id
    regexChecker("![a-zA-Z_][0-9a-zA-Z_]*", /*file*/);
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
    return matches;
    }
  }

  public static void main(String[] args) {
    // First: Select directory to upload files
    // Array of Strings

    // Second: Parse files with Regex
    // Third : Store in sorted maps

    // Fourth: User Interface
    //while loop
    // Ask user how to Sort
    // Switch statements for commands
    //  Follow up request for data if needed
  }
}
