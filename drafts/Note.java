import java.util.ArrayList;

public class Note {

  private ArrayList<String> mentions = new ArrayList<String>(); // '@'
  private ArrayList<String> topics = new ArrayList<String>();   // '#'
  private ArrayList<String> urls = new ArrayList<String>();     // ''
  private ArrayList<String> refs = new ArrayList<String>();     // '^'

  private String id;  // '!'
  private String text;

  public Note(ArrayList<String> mentions, ArrayList<String> topics, ArrayList<String> urls, ArrayList<String> refs, String id, String text){
      this.mentions = mentions;
      this.topics = topics;
      this.urls = urls;
      this.refs = refs;
      this.id = id;
      this.text = text;
  }

  // Returns an ArrayList of all mentions
  public ArrayList<String> getMentions(){
      return mentions;
    }

  // Returns an ArrayList of all topics
  public ArrayList<String> getTopics(){
      return topics;
    }

  // Returns an ArrayList of all urls
  public ArrayList<String> getURLs(){
      return urls;
    }

  // Returns an ArrayList of all refs
  public ArrayList<String> getRefs(){
      return refs;
    }

  // Returns ID
  public String getID(){
      return id;
    }
  // Returns full text
  public String getText(){
      return text;
    }

  // Returns index of first topic if a match is located; Else return -1
  public int findTopic(String topic){
      return topics.indexOf(topic);
    }

  // Returns index of first meniton if a match is located; Else return -1
  public int findMention(String mention){
      return mentions.indexOf(mention);
    }

  // Returns index of first URL if a match is located; Else return -1
  public int findURL(String url){
      return urls.indexOf(url);
    }

  // Returns index of first URL if a match is located; Else return -1
  public int findRef(String ref){
      return refs.indexOf(ref);
    }
}
