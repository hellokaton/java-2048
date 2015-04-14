package com.github.biezhi.j2048.entity;

import java.awt.Graphics;

/**
 * 计数对象
 * @author biezhi
 *
 */
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
			
			int dx1 = this.s_x + SIZE_SCORE + i * SIZE_NUM;
			int dy1 = this.s_y + 8;
			
			int dx2 = this.s_x + SIZE_SCORE + SIZE_NUM + i * SIZE_NUM;
			int dy2 = this.s_y + 8 + SIZE_NUM;
			
			g.drawImage(Images.img_num, dx1, dy1, dx2, dy2, x, 0, SIZE_NUM + x, SIZE_NUM, null);
		}
	}
}
