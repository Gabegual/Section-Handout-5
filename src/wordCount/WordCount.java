package wordCount;

import java.io.*;
import java.util.*;

public class WordCount {
	public static void main(String[] args) throws Exception {
		File text = new File("Shakespeare.txt");
		FileInputStream fileStream = new FileInputStream(text);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader SP = new BufferedReader(input);

		String line;

		int countWord = 0;
		int sentenceCount = 0;
		int characterCount = 1;

		while ((line = SP.readLine()) != null) {

			characterCount += line.length();
			String[] wordList = line.split("( )|(')");

			countWord += wordList.length;
			String[] sentenceList = line.split("\\n");
			sentenceCount += sentenceList.length;

		}
		System.out.println("Total word count=" + sentenceCount);
		System.out.println("Total number of sentence=" + sentenceCount);
		System.out.println("Total number of characters=" + characterCount);

	}

}
