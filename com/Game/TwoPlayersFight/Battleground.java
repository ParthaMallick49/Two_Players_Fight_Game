package com.Game.TwoPlayersFight;


// Imported necessary class 
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Battleground {
	
	// Main method
     public static void main(String[] args) {
		

    	 welcomeMessage();
    	 
    	 // Creating object of player1 and player2 with their name.
    	 player1 p1 = new player1("Computer"); 
    	 player2 p2 = new player2("Partha",true);
    	 
    	 // Pick a weapon for player1 and player2
    	 p1.setPlayerWeapon("AKM.");
    	 p2.setPlayerWeapon("M416.");
   
    	 Scanner in = new Scanner(System.in);
    	 Random rn = new Random();
    	 
    	 
    	 // Showing primary details for both players.
    	 System.out.println("		 "+p1.playerName + " Health : "+ player1.player1health + " -- Armor (NO)");
    	 System.out.println("		 "+p2.playerName + " Health   : "+ player2.player2health + " -- Armor (YES)\n\n");
    	 
         System.out.println("\nStart Fight: \n");
         
         delay();
         
    	 while(player1.player1health>=0 || player2.player2health>=0){
        	 
    		 /*------------------------- Virtual Player ----------------------*/
    		 
    		 // Generate a random number from (1 - 3).
    		 // And check which option will player1 chose.
    		 int computerChoice = rn.nextInt(3)+1;
    		 
    		 if(computerChoice == 1){
        		 System.out.print("\n"+p1.playerName);
        		 p1.shootByGun1();
        		 System.out.println("   "+ p2.playerName + " New health "+ player2.player2health );
    		 }else if(computerChoice == 2){
        		 System.out.print("\n"+p1.playerName);
        		 p1.shootByGun2();
        		 System.out.println("   "+ p2.playerName + " New health " + player2.player2health);
        	 }
    		 else if(computerChoice == 3){
    			 p1.takeDrink();
    		 }
    		 
    		 /*------------------------- Virtual Player ----------------------*/ 
    		 
    		 delay();
    		 
    		 // Check for the winer.
    		 if(player1.player1health<=0 || player2.player2health<=0){
        		 if(player1.player1health<=0){
        			 System.out.println("\n\n\n--------- Victory ---------");
       		         System.out.println("\n"+ p2.playerName+" Win with health "+ player2.player2health);
        			 break;
        		 }else{
        			 System.out.println("\n\n\n--------- Victory ---------");
        			 System.out.println("\n"+ p1.playerName +" Win with health "+ player1.player1health);	 
        			 break;
        		 }	 
        	 }
    		 
    		 
    		 /*------------------------ Real player-----------------------*/
    		 
        	 System.out.println("\nNow it's your turn: ");
        	 System.out.println(" 1. Shoot with ShortGun \n 2. Shoot with " +p2.getPlayerWeapon()
        	                                      +"\n 3. Take Drink\n");
        	 
        	 // Take input from user and check it with the option.
        	 System.out.print("Enter number: ");
        	 int realPlayerInput = in.nextInt();
        	 
        	 switch (realPlayerInput){                                  
        	 case 1:  
        		 System.out.print("\n"+p2.playerName);
        		 p2.shootByGun1();
        		 System.out.println("   "+ p1.playerName + " New health "+ player1.player1health );
        		 break;
        
        	 case 2:
        		 System.out.print("\n"+p2.playerName);
        		 p2.shootByGun2();
        		 System.out.println("   "+ p1.playerName + " New health "+ player1.player1health );
        		 break;
        	
        	 case 3:
        		 p2.takeDrink();
        	 default:
        		 break;
        	 }
        	 
        	 /*------------------------ Real player-----------------------*/
        	 
        	 delay();
        	 
        	 // Check for the winer.
        	 if(player1.player1health<=0 || player2.player2health<=0){
        		 if(player1.player1health<=0){
        			 System.out.println("\n\n\n--------- Victory ---------");
       		         System.out.println("\n"+ p2.playerName+" Win with health "+ player2.player2health);
        			 break;
        		 }else{
        			 System.out.println("\n\n\n--------- Victory ---------");
        			 System.out.println("\n"+ p1.playerName +" Win with health "+ player1.player1health);	 
        			 break;
        		 }	 
        	 }
        	 
        	
        	 
        	 System.out.println("=============================\n");
        	 delay();
    	 }	
    	   
    	 in.close();
	}
     
     // For displaying welcome message.
     public static void welcomeMessage(){
    	 System.out.println("\n\n		:: :: :: :: :: :: :: :: :: :: :: :: ::");
    	 System.out.println("		::                                  ::");
    	 System.out.println("		::                                  ::");
    	 System.out.println("		::                                  ::");
    	 System.out.println("		::      WELCOME TO BETTELGROUND     ::");
    	 System.out.println("		::                                  ::");
    	 System.out.println("		::                                  ::");
    	 System.out.println("		::                                  ::");
    	 System.out.println("		:: :: :: :: :: :: :: :: :: :: :: :: ::\n\n");
     }
     
     
     // For delaying console output.
     public static void delay(){
    	 try {
			TimeUnit.SECONDS.sleep(1);
		 } catch (InterruptedException e) {
			e.getMessage();
		 }
	 }
}
