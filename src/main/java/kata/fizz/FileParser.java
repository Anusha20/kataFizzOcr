package kata.fizz;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {

	/**
	 * 
	 * Reads the input file
	 * @param filename
	 * @param encoding
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<String> handleFile(String filename, Charset encoding) throws IOException {
		try {
			Path path = FileSystems.getDefault().getPath(filename);
			BufferedReader reader = Files.newBufferedReader(path);

			return handleCharacters(reader);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return new ArrayList<String>();
	}
/**
 * reads the file and stores the content as a ArrayList
 * @param reader
 * @return
 * @throws Exception 
 * 		- when ever the number of charachters in the line is not equal to 27 or there are unwanted characters
 */
	public static ArrayList<String> handleCharacters(BufferedReader reader) throws Exception {

		Scanner s = new Scanner(reader);
		s.useDelimiter(System.getProperty("line.separator"));
		ArrayList<String> lines = new ArrayList<String>();

		while (s.hasNext()) {
			String line = s.next();

			line = getValidLines(line);

			if (!line.isEmpty()) {
				lines.add(line);
			}

		}
		return lines;

	}

	/**
	 * 
	 * Making sure that 27 characters are present in a line
	 * 
	 * @param line
	 * @return
	 * @throws Exception
	 */
	public static String getValidLines(String line) throws Exception {

		if (line.length() > 27) {
			line = line.substring(0, 26);
		}
		if (line.length() == 26) {
			line = line + " ";
		}

		if (line.length() == 27) {
			return line;
		}
		if (line.isEmpty()) {
			return line;
		}
		throw new Exception("No of characters in the input is incorrect: expected 27 , actuallenght: " + line.length()
				+ ":linecontent:" + line);
	}
}
