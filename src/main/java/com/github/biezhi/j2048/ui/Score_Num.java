package com.github.biezhi.j2048.ui;

import java.awt.Graphics;

import com.github.biezhi.j2048.entity.Grid;

public class Score_Num extends Score {
	
	private static final int SIZE_NUM = 21;
	
	private static final int SIZE_SCORE = 80;
	
	private int x;
	
	private Grid grid;
	
	public Score_Num(Grid grid) {
		this.grid = grid;
	}
	
	public void drawNum(Graphics g){
		String gameNumString = Integer.toString(grid.getNum());
		for (int i = 0; i < gameNumString.length(); i++) {
			int NumBit = gameNumString.charAt(i)-'0';
			this.x = NumBit*SIZE_NUM;
			g.drawImage(Images.img_num, this.s_x+SIZE_SCORE+i*SIZE_NUM, this.s_y+8, this.s_x+SIZE_SCORE+SIZE_NUM+i*SIZE_NUM, this.s_y+8+SIZE_NUM,
					x, 0, SIZE_NUM+x, SIZE_NUM, null);
		}
	}
}
