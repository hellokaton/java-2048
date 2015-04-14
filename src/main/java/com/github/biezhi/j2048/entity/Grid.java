package com.github.biezhi.j2048.entity;

/**
 * 地图
 * @author biezhi
 *
 */
public class Grid {

	private int num = 0;
	private int x;
	private int y;
	private int[][] map = new int[4][4];

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	};

}
