package com.Game.TwoPlayersFight;

public class player1 {                                           
    
	// These are the properties of player 1.
	public String playerName;
    private String PlayerWeapon;
	public static int player1health = 100;
	
	// Constructor
	public player1(String playerName){
		this.playerName = playerName;
	}
	
	
	// Player 1 shoot player 2 by gun1.
	public void shootByGun1(){
		player2.player2health-=20;
		
		if(player2.player2health<=0)
			player2.player2health = 0;
		
		System.out.println(" Shoot with ShortGun. ");
	}
	
	
	// Player 1 shoot player 2 by gun2.
	public void shootByGun2(){
		player2.player2health-=40;
		
		if(player2.player2health<=0)
			player2.player2health = 0;
		
		System.out.println(" Shoot with " + getPlayerWeapon() +". ");
	}

	public String getPlayerWeapon() {
		return PlayerWeapon;
	}

	public void setPlayerWeapon(String playerWeapon) {
		PlayerWeapon = playerWeapon;
	}
	
	
	// Take energy drinks for boost up health. 
	public void takeDrink(){
		player1health+=20;
		if(player1health>100){
			player1health=100;
		}
		System.out.println(playerName + " Take Drinks.");
	}

}
