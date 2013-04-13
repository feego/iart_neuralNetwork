package dataSetParser;

import java.util.Scanner;

public class Block {
	private int block_type;
	
	private int height;
	private int length;
	private int area;
	private float eccen;
	private float p_black;
	private float p_and;
	private float mean_tr;
	private int blackpix;
	private int blackand;
	private int wb_trans;
	
	public Block(String line) {
		parseContent(line);
	}

	private void parseContent(String line) {
		Scanner tokenizer = new Scanner(line);
		
		height = tokenizer.nextInt();
		length = tokenizer.nextInt();
		area = tokenizer.nextInt();
		eccen = tokenizer.nextFloat();
		p_black = tokenizer.nextFloat();
		p_and = tokenizer.nextFloat();
		mean_tr = tokenizer.nextFloat();
		blackpix = tokenizer.nextInt();
		blackand = tokenizer.nextInt();
		wb_trans = tokenizer.nextInt();
		
		block_type = tokenizer.nextInt();
		
		tokenizer.close();
	}

	public int getHeight() {
		return height;
	}

	public int getLength() {
		return length;
	}

	public int getArea() {
		return area;
	}

	public float getEccen() {
		return eccen;
	}

	public float getP_black() {
		return p_black;
	}

	public float getP_and() {
		return p_and;
	}

	public float getMean_tr() {
		return mean_tr;
	}

	public int getBlackpix() {
		return blackpix;
	}

	public int getBlackand() {
		return blackand;
	}

	public int getWb_trans() {
		return wb_trans;
	}

	public int getBlock_type() {
		return block_type;
	}
}
