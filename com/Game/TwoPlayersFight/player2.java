package com.Game.TwoPlayersFight;

public class player2 extends player1 {                               
	
	//These are the properties of player 2
	boolean armor;
	private String PlayerWeapon;
	public static int player2health = 100;
	
	
	//Constructor
	public player2(String playerName, boolean armor){                     
		super(playerName);
		this.armor = armor;
	}

	
	// Player 2 shoot player 1 by gun1.
	@Override
	public void shootByGun1() {
	     player1.player1health -= 30;
	     
	     if(player1.player1health<=0)
	    	 player1.player1health = 0;
	     
	     System.out.println(" Shoot with ShortGun. ");
	}

	
	// Player 2 shoot player 1 by gun2.
	@Override
	public void shootByGun2() {
		player1.player1health -= 50;
		
		 if(player1.player1health<=0)
			 player1.player1health = 0;
		 
		 System.out.println(" Shoot with " + getPlayerWeapon() + ". ");
	}

	
	// Take energy drinks for boost up health.
	@Override
	public void takeDrink() {
		player2health+=20;
		System.out.println(playerName + " Take Drinks.");
	}
	
	public String getPlayerWeapon() {
		return PlayerWeapon;
	}

	
	public void setPlayerWeapon(String playerWeapon) {
		PlayerWeapon = playerWeapon;
	}
    
	
}
