public class Note {

  ArrayList<String> mentions = new ArrayList<String>(); // '@'
  ArrayList<String> topics = new ArrayList<String>();   // '#'
  ArrayList<String> urls = new ArrayList<String>();     // ''
  ArrayList<String> refs = new ArrayList<String>();     // '^'

  Private String id;  // '!'

  public Note(ArrayList<String> mentions, ArrayList<String> topics, ArrayList<String> urls, ArrayList<String> refs, String id){
      this.mentions = mentions;
      this.topics = topics;
      this.urls = urls;
      this.ref = refs;
      this.id = id;
  }

  // Recieves an Arraylist to set mentions
  public void setMentions(ArrayList mentions){

    }

  // Returns an ArrayList of all mentions
  public ArrayList<String> getMentions(){
      return mentions;
    }

  // Returns index of first meniton if a match is located; Else return -1
  public int findMention(){

    }

  // Recieves an Arraylist to set topics
  public void setTopics(ArrayList topics){

    }

  // Returns an ArrayList of all topics
  public ArrayList<String> getTopics(){
      return topics
    }

  // Returns index of first topic if a match is located; Else return -1
  public int findTopic(){

    }

  // Recieves an Arraylist to set urls
  public void setURLs(ArrayList urls){

    }

  // Returns an ArrayList of all urls
  public ArrayList<String> getURLs(){
      return urls
    }

  // Returns index of first URL if a match is located; Else return -1
  public int findURL(){

    }




  public getID(){

    }

  public void setID(String id){

    }


  // public getRefs(){
  //
  //   }
  //
  // public void setRefs(ArrayList refs){
  //
  //   }


  public String getText(){

    }

  public void setText(){

    }

}
