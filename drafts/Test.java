
import java.util.regex.*;
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Test{
  public static final String FOLDERNAME = "/Users/don/Loyola_Comp330_Team_Project1/TestNotes";
//Finished
  public static String[] listFilesForFolder(final File folder) {

    String[] fileNames;

    fileNames = folder.list();
    //  for(String file:fileNames) {
    //     System.out.println(file);
    //  }
    return fileNames;
  }
//Finished
  public static String readFile(String fileName){
    String filePath = FOLDERNAME + "/" + fileName;
    String content = "";
      try
      {
          content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
      }
      catch (IOException e)
      {
          e.printStackTrace();
      }
      return content;
  }

  public static void setMentions(String fileName, TreeMap<String,ArrayList<String>> mentions){

    ArrayList<String> mentionKeys = new ArrayList<String>();

    // Check for '@' mentions
    mentionKeys = regexChecker("@[a-zA-Z_][0-9a-zA-Z_]*", fileName);

    ArrayList<String> temp = new ArrayList<String>();

    for(String m:mentionKeys) {
        // keys match to an ArrayList so that multiple values can be stored

        }
  }

  public static void SortNotes(String[] files){
    TreeMap<String,ArrayList<String>> mentions = new TreeMap<String,ArrayList<String>>();

    String tempText = "";
    for(String file:files){
      // setMentions(file, mentions);
    }

    // System.out.println(mentions);
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

  public static void main(String[] args) {

    final File folder = new File(FOLDERNAME);
    SortNotes(listFilesForFolder(folder));

  }
}
