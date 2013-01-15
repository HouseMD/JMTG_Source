package com.jmtg.game.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

	protected ArrayList<String> read = new ArrayList<String>();

	public Reader(File file) {

		try {
			read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<String> getRead() {
		return read;
	}

	protected void read(File file) throws IOException {

		try {

			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String newline = ignoreComments(line);
				if (newline != null)
					read.add(newline);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static String ignoreComments(String line) {
		String result_line = null;
		int upto = line.indexOf('#');
		if (upto != 0 && upto > 0) {
			result_line = line.substring(0, upto);
		} else {
			if (upto < 0) {
				result_line = line;
			}/*
			 * else{ result_line=""; }
			 */
		}

		return result_line;

	}

}
