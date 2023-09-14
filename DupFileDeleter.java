import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	/*Things To Do:
	 * Access Files X
	 * Display File Names X
	 * Menu Format X
	 * Delete Files that are duplicated
	 * Give an option to delete only one of the files that is duplicated
	 * "C:\\Users\\jacob\\Desktop\\FileDupDeleter\\Files"
	 * This PC\motorola one 5G ace\Internal shared storage\Music
	 * This PC\motorola one 5G ace\Internal shared storage\Music
	 * "C:\Users\jacob\.cache"
	 */

public class DupFileDeleter
{
	public static void main(String[] args) {

		//Prompt user for file location
		Scanner Input = new Scanner(System.in);
		System.out.println("Input location of files: ");
		String fileLocation = Input.nextLine();

		//Modify user file location
		String finalFileString = fileLocation.replace("\\", "\\\\");
		
		//Get Files
		File directory = new File(finalFileString);

		//Output File location
		// System.out.println(finalFileString);

		// Put file names in string arraylist
		List<String> fileList = new ArrayList<>();
		for (File file: directory.listFiles()) {
			fileList.add(file.getName());
		}
		fileList.sort(String::compareToIgnoreCase);

		String first = "";
		for (int i=0; i<fileList.size(); i++) {
			first = fileList.get(0);
		}
		
		displayMenu();
		int UserInput = Input.nextInt();
		while (UserInput != 5) {
		switch (UserInput) {
			
			case 1:	displayFileNames(fileList);
					break;
			case 2: System.out.println("you chose 2");
					break;
			case 3: System.out.println("you chose 3");
					break;
			case 4: System.out.println(first);
					break;
			
		}
		UserInput = Input.nextInt();
		if (UserInput == 5) {
			System.out.println("Exiting");
		}
	}	
		Input.close();
	}

	//Create Menu
	public static void displayMenu() {
		String Menu = "Duplicate File Deleter Menu \n" 
						+ "1: Display File Names \n"
						+ "2: Delete Duplicated Files \n"
						+ "3: Delete files of a specific file type \n"
						+ "4: Delete only one of duplciated files (webm) \n"
						+ "5: Exit";
		System.out.println(Menu);
	}

	//Display FileNames
	public static void displayFileNames(List<String> list) {
		for(int i = 0; i<list.size(); i++) {
			String fileName = list.get(i);
			System.out.println(fileName);
		}
	}

	//REMOVEDUP CLASS
// public static int removeDuplicateElements(int arr[], int n){  
//         if (n==0 || n==1){  
//             return n;  
//         }  
//         int[] temp = new int[n];  
//         int j = 0;  
//         for (int i=0; i<n-1; i++){  
//             if (arr[i] != arr[i+1]){  
//                 temp[j++] = arr[i];  
//             }  
//          }  
//         temp[j++] = arr[n-1];     
//         // Changing original array  
//         for (int i=0; i<j; i++){  
//             arr[i] = temp[i];  
//         }  
//         return j;  
//     }  

}
