package com.github.biezhi.j2048.ui;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.github.biezhi.j2048.entity.Grid;
import com.github.biezhi.j2048.entity.Images;
import com.github.biezhi.j2048.entity.Score;
import com.github.biezhi.j2048.entity.Score_Num;
import com.github.biezhi.j2048.entity.Tile;

/**
 * 主面板
 * @author biezhi
 *
 */
public class MainPanel extends JPanel{
	
	private static final long serialVersionUID = 5208752396275315085L;
	
	private MainFg mainFg;
	private Score score;
	private Score_Num scoreNum;
	private MainGame mainGame;
	private Grid grid;
	
	public MainPanel(Grid grid,Tile tile){
		this.grid = grid;
		this.mainFg = new MainFg(grid);
		this.score = new Score();
		this.mainGame = new MainGame(grid, tile);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		this.scoreNum = new Score_Num(grid);
		
		g.drawImage(Images.img_bg, 0, 0, null);
		
		// 设置背景
		this.mainFg.drawWin(g);
		
		// 设置分数标题文字
		this.score.drawScore(g);
		
		// 设置分数数字
		this.scoreNum.drawNum(g);
		
		// 重绘游戏界面
		this.mainGame.GamePaint(g);
		
	}
	
}
