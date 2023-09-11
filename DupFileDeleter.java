import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DupFileDeleter
{
	/*Things To Do:
	 * Access Files
	 * Display File Names
	 * Menu Format
	 * Delete Files that are duplicated
	 * Give an option to delete only one of the files that is duplicated
	 */
	public static void main(String[] args) {

		//Get Files
		
		File directory = new File("C:\\Users\\jacob\\Desktop\\FileDupDeleter\\Files");
		List<String> fileList = new ArrayList<>();

		for (File file: directory.listFiles()) {
			fileList.add(file.getName());
		}
		String first = "";
		for (int i=0; i<fileList.size(); i++) {
			first = fileList.get(0);
		}

		//Display FileNames
		for(int i = 0; i<fileList.size(); i++) {
			String fileName = fileList.get(i);
			System.out.println(fileName);
		}


		//Create Menu
		String Menu = "Duplicate File Deleter Menu \n" 
						+ "1: Display File Names \n"
						+ "2: Delete Duplicated Files \n"
						+ "3: Delete files of a specific file type \n"
						+ "4: Delete only one of duplciated files (webm) \n"
						+ "5: Exit";
		System.out.println(Menu);
		Scanner Input = new Scanner(System.in);
		int UserInput = Input.nextInt();
		while (UserInput != 5) {
		switch (UserInput) {
			
			case 1:		;
					break;
			case 2: System.out.println("you chose 2");
					break;
			case 3: System.out.println("you chose 3");
					break;
			case 4: System.out.println("you chose 4");
					break;
			
		}
		UserInput = Input.nextInt();
		if (UserInput == 5) {
			System.out.println("Exiting");
		}
	}	
		Input.close();
	}

	// public static void DisplayList(String list[]) {

	// 	for(int i = 0; i<list.size(); i++) {
	// 		String fileName = list.get(i);
	// 		System.out.println(fileName);
	// 	}
	// }



}
