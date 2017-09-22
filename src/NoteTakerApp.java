import java.util.*;

public class NoteTakerApp{

	public static void printTree(TreeMap<String,ArrayList<String>> tm){

		for(Map.Entry<String,ArrayList<String>> entry : tm.entrySet()) {
		  String key = entry.getKey();
		  ArrayList<String> value = entry.getValue();

		  System.out.println(key + " => " + value);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean runApp = true;


		NoteRetriever retriever = new NoteRetriever();
		NoteSorter		sorter		= new NoteSorter();
		Notes					notes			= new Notes();
		HashMap<String, String> files = new HashMap<String, String>();

		//Get directory path from user
		System.out.println("Enter directory path:");
		String dirPath = input.nextLine();
		dirPath = "/Users/don/Loyola_Comp330_Team_Project1/TestNotes";

		// Send directory path to NoteRetriever
		files = retriever.getFiles(dirPath);

		// Set values for notes
		notes.setMentions(sorter.sort(files, "@[a-zA-Z_][0-9a-zA-Z_]*"));
		notes.setTopics(sorter.sort(files, "#[a-zA-Z_][0-9a-zA-Z_]*"));

		//Command Line Interface
		ArrayList<String> listArgs;
		String userArgs;
		String cmd;
		int numArgs;
		while(runApp){
			System.out.println("Enter a command or \"Q/q\" to quit:");
			userArgs = input.nextLine();

			listArgs = new ArrayList<String>(Arrays.asList(userArgs.split(" ")));
			numArgs = listArgs.size();
			cmd = listArgs.get(0);
			if (numArgs == 1) {
				switch (cmd){
					case "@" :
						printTree(notes.getAllMentions());
						break;
					case "#" :
						printTree(notes.getAllTopics());
						break;
					case "Q" :
					case "q" :
						runApp = false;
						break;
					default:
						System.out.println("Please enter a valid command");
				}
			}
			else if (numArgs > 1) {
				//Call selectively
				switch (cmd){
					case "@" :
						printTree(notes.getMentions(listArgs));
						break;
					case "#" :
						printTree(notes.getTopics(listArgs));
						break;
					case "Q" :
					case "q" :
						runApp = false;
						break;
					default:
						System.out.println("Please enter a valid command");
				}

			}
			else{
				runApp = false;
			}
		}


		// Call methods in Notes
		// Swtich cases match character from input[0]

	}
}

// printTree(notes.getAllMentions());
// printTree(notes.getAllTopics());
// printTree(sorter.sort(files, "\\^[a-zA-Z_][0-9a-zA-Z_]*"));
