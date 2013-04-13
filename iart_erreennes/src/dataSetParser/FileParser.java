package dataSetParser;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class FileParser {
	private Queue<Block> dataSetLines = new LinkedList<Block>();

	public FileParser(String filePath) throws IOException {
		FileInputStream fstream = new FileInputStream(filePath);
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		while (br.ready()) {
			dataSetLines.add(new Block(br.readLine()));
		}
		br.close();
	}
	
	public Block getNetxBlock() {
		return dataSetLines.poll();
	}
}
