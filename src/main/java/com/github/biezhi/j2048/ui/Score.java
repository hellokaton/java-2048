package com.github.biezhi.j2048.ui;

import java.awt.Graphics;

public class Score {
	
	protected int s_x = 150;
	protected int s_y = 50;
	
	public void drawScore(Graphics g){
		g.drawImage(Images.img_score, s_x, s_y, null);
	}
}
