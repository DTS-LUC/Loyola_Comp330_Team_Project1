import java.util.*;

public class NoteTakerApp{

	public static void main(String[] args) {
		NoteRetriever retriever = new NoteRetriever();
		HashMap files<String, String> = new HashMap();
		Notes notes = new Notes();
		//Get directory path from user
		String dirPath = "/Users/don/Loyola_Comp330_Team_Project1/TestNotes";
		// Send directory path to NoteRetriever
		files = retriever.getFiles(dirPath);
		// Send files to Notes

		// Call methods in Notes

	}
}
