package com.github.biezhi.j2048;


import com.github.biezhi.j2048.entity.Grid;
import com.github.biezhi.j2048.entity.Tile;
import com.github.biezhi.j2048.ui.MainFrame;
import com.github.biezhi.j2048.ui.MainPanel;

/**
 * 2048游戏
 * @author biezhi
 *
 */
public class Run {

	public static void main(String[] args) {
		
		// 创建地图
		Grid grid = new Grid();
		
		// 创建方块
		Tile tile = new Tile(grid);
		
		// 创建游戏主窗口
		MainFrame mainFrame = new MainFrame();
		
		// 创建游戏panel
		MainPanel mainPanel = new MainPanel(grid, tile);
		
		// 创建游戏控制器对象
		GameControl gameControl = new GameControl(mainPanel, tile);
		
		// 设置窗口可见
		mainFrame.setVisible(true);
		
		// 添加键盘监听器
		mainFrame.addKeyListener(gameControl);
		
		// 设置游戏主panel
		mainFrame.setContentPane(mainPanel);
		
	}
}
