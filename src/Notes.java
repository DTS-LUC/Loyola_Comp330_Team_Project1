import java.util.*;

public class Notes{
	// Key: @identifier Value: fileName
	TreeMap<String,ArrayList<String>> mentions = new TreeMap<String,ArrayList<String>>(); // '@'


	// Methods for setting values
	public void setMentions(TreeMap<String,ArrayList<String>> mentions){
		this.mentions = mentions;
	}

}
