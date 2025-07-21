package inputOutputOperations;

import java.io.*;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
//		String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
//		String desktopPath = "C:\\Users\\your userName \\OneDrive\\Desktop";
		String desktopPath = System.getenv("USERPROFILE") + "\\OneDrive\\Desktop";
		System.out.println("Enter the Input file name: ");
		String inputFile = sc.nextLine();
		System.out.println("Enter the Output file name: ");
		String outputFile = sc.nextLine();
		String inputFilePath = desktopPath + File.separator + inputFile;
		String outputFilePath = desktopPath + File.separator + outputFile;
		File file = new File(inputFilePath);
//		System.out.println("Looking for file at: " + inputFilePath);
		if(!file.exists()) {
			System.out.println("File not found");
			return;
		}
		
		BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath));
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		System.out.println("Files copied");
	}
}
