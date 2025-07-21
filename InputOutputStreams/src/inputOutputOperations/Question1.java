package inputOutputOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String desktopPath = System.getenv("USERPROFILE") + "\\OneDrive\\Desktop";
		System.out.print("Enter the filename: ");
		String fileName = sc.nextLine();
		System.out.print("Enter the target character: ");
		char target = sc.nextLine().toLowerCase().charAt(0);
		String fileNamePath = desktopPath + File.separator + fileName;
		
		File file = new File(fileNamePath);
		if(!file.exists()) {
			System.out.println("File not found");
			return;
		}
		
		BufferedReader br = new BufferedReader(new FileReader(fileNamePath));
		int count = 0;
		int ch;
		while((ch = br.read()) != -1) {
			if(Character.toLowerCase((char) ch) == target) count++;
		}
		System.out.println("File \'"+ fileName + "\' has " + count + " instances of letter \'" + target + "\'." );

	}

}
