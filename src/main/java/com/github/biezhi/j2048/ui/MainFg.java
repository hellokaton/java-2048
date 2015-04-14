package com.github.biezhi.j2048.ui;

import java.awt.Graphics;

import com.github.biezhi.j2048.entity.Grid;
import com.github.biezhi.j2048.entity.Images;

public class MainFg {

	private int x = 45;
	private int y = 95;
	
	public MainFg(Grid grid) {
		grid.setX(x);
		grid.setY(y);
	}
	
	public void drawWin(Graphics g) {
		g.drawImage(Images.img_fg, x, y, null);
	}
}
