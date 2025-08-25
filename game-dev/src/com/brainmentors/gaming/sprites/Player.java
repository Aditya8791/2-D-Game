package com.brainmentors.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Sprite{
	
	public Player() {
		w = 200;
		h = 200;
		x = 100;
		y = 450;
		image = new ImageIcon(Player.class.getResource("Player.gif"));
	
	}
	 public void move () {
		 x = x + speed;
	 }
	 public boolean outOfScreen() {
		 return x>1500;
	 }
	

}
