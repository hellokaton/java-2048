package com.github.biezhi.j2048;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.github.biezhi.j2048.entity.Tile;
import com.github.biezhi.j2048.ui.MainPanel;

/**
 * 键盘监听器
 * @author biezhi
 *
 */
public class GameControl extends KeyAdapter {

	private MainPanel mainPanel;
	private Tile tile;
	/**
	 * 游戏控制类
	 * @author fengche
	 * */
	public GameControl(MainPanel mainPanel, Tile tile) {
		this.mainPanel = mainPanel;
		this.tile = tile;
	}

	/**
	 * 键盘事件监听
	 * @author fengche
	 * */
	@Override
	public void keyReleased(KeyEvent e) {
		super.keyReleased(e);
		switch (e.getKeyCode()) {
		// 左移
		case 37: {
			int ismov = tile.moveLeft();
			int isremove = tile.removeLeft();
			if (ismov == 1 || isremove == 1) {
				// new block
				tile.newBlok();
			}
		}
			break;
		// 上移
		case 38: {
			int ismov = tile.moveUp();
			int isremove = tile.removeUp();
			if (ismov == 1 || isremove == 1) {
				// new block
				tile.newBlok();
			}
		}
			break;
		// 右移
		case 39: {
			int ismov = tile.moveRight();
			int isremove = tile.removeRight();
			if (ismov == 1 || isremove == 1) {
				// new block
				tile.newBlok();
			}
		}
			break;
		// 下移
		case 40: {
			int ismov = tile.moveDown();
			int isremove = tile.removeDown();
			if (ismov == 1 || isremove == 1) {
				// new block
				tile.newBlok();
			}
		}
			break;
		}
		
		//刷新游戏窗口
		this.mainPanel.repaint();
		
		//判断是不是gameover
		tile.isGameOver();
	}
}