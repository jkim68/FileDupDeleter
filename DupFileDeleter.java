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
	 * "C:\\Users\\jacob\\Desktop\\FileDupDeleter\\Files"
	 */

public class DupFileDeleter
{
	public static void main(String[] args) {

		
		Scanner Input = new Scanner(System.in);
		System.out.println("Input location of files to be deleted: ");
		String fileLocation = Input.nextLine();
		String finalFileString = fileLocation.replace("\\", "\\\\");
		//Get Files
		File directory = new File(finalFileString);
		System.out.println(finalFileString);
		List<String> fileList = new ArrayList<>();

		// Put file names in string arraylist
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

		displayMenu();
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

	// public static void DisplayList(String list[]) {

	// 	for(int i = 0; i<list.size(); i++) {
	// 		String fileName = list.get(i);
	// 		System.out.println(fileName);
	// 	}
	// }

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
