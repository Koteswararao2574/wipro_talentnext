package inputOutputOperations;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Question3 {

	public static void main(String[] args)throws IOException {
		if(args.length < 2) {
			System.out.println("Please enter the input and output files.");
			return;
		}
		String desktopPath = System.getenv("USERPROFILE") + "\\OneDrive\\Desktop";
		
		String input = args[0];
		String output = args[1];
		
		String inputFilePath = desktopPath + File.separator + input;
		String outputFilePath = desktopPath + File.separator + output;
		
		File inputFile = new File(inputFilePath);
		File outputFile = new File(outputFilePath);
		
		
//		System.out.println("Looking in: " + inputFilePath);
//		System.out.println("Looking in: " + outputFilePath);
		
		
		if(!inputFile.exists()) {
			System.out.println("File not found");
			return;
		}
		
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		Map<String,Integer> count = new TreeMap<>();
		String line;
		while((line = br.readLine()) != null) {
			String[] words = line.split("\\s+");
			for(String word: words) {
				if(word != null) {
					count.put(word, count.getOrDefault(word, 0)+1);
				}
				
			}
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
		for(Map.Entry<String, Integer> i: count.entrySet()) {
			bw.write(i.getKey() + " : " + i.getValue());
			bw.newLine();
		}
		bw.close();

	}

}
