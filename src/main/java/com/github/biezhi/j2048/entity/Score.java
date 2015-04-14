package com.github.biezhi.j2048.entity;

import java.awt.Graphics;

/**
 * 分数对象
 * @author biezhi
 *
 */
public class Score {
	
	protected int s_x = 150;
	protected int s_y = 50;
	
	public void drawScore(Graphics g){
		g.drawImage(Images.img_score, s_x, s_y, null);
	}
}
