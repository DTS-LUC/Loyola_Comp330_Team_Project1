import java.util.*;

public class NoteTakerApp{

	public static void main(String[] args) {
		NoteRetriever retriever = new NoteRetriever();
		HashMap<String, String> files = new HashMap<String, String>();

		//Get directory path from user
		String dirPath = "/Users/don/Loyola_Comp330_Team_Project1/TestNotes";
		// Send directory path to NoteRetriever
		files = retriever.getFiles(dirPath);
		// Send files to Notes
		Notes notes = new Notes(files);
		// Call methods in Notes
		// Swtich cases match character from input[0]

	}
}
