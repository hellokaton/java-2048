package com.github.biezhi.j2048.ui;

import javax.swing.JFrame;
	
public class MainFrame extends JFrame{

	private static final long serialVersionUID = -8808883923263763897L;

	public MainFrame(){
		this.setTitle("java-2048");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(450,530);
		this.setLocationRelativeTo(null);
	}
}
