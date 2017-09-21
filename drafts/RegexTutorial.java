import java.util.regex.*;
import java.util.ArrayList;

public class RegexTutorial {

  public static void main(String[] args) {

    String longString = " @Derek9 Banas CA 12345 PA (412)555-1212 @johnsmith @hotmail_com 412-555-1234 412 555-1234 #This is great #NOway";
    String strangeString = " 1Z !aaa !!! **** *** {{{ {{ { ";

    /*
      [ ]  Insert characters that are valid
      [^ ]  Insert characters that are not valid
      \\s  Any white space
      \\S  Any non white space
      {n,m}  Whatever proceeds must occur between n and m times
    */

    // Word must contain letters that are 2 to 20 characters in length
    // [A-Za-z]{2,20} 0r \w{2,20}

    // regexChecker("\\s[A-Za-z]{2,20}\\s", longString);

    /*
      \\d  Any digits 0-9
      \\D  Anything not a number
      {n}  Whatever proceeds must occur n times
    */

    // Only 5 digits
    // \\s[0-9]{5}\\s or \\d{5}

    // regexChecker("\\s\\D{5}\\s", longString);

    /*
      | Is used for OR clause situations
    */

    // Must start with a A or C, followed by 1 letter in brackets
    // Must be a maximum of 2 characters in length
    // A[KLRZ]|C[AOT]
    // regexChecker("A[KLRZ]|C[AOT]", longString);

    // Must start with @ identifier
    // Then a letter followed by zero or more letters or digits
    // Underscores and hyphens may be used in identifiers anywhere a letter is permitted
    regexChecker("@[a-zA-Z_][0-9a-zA-Z_]*", longString);
    regexChecker("#[a-zA-Z_][0-9a-zA-Z_]*", longString);
  }

  public static void regexChecker(String theRegex, String str2Check){

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
  }
}
