package com.Bridgelabz.SnakeAndLadder;

public class SnakeAndLadder 
  { 
      // Constants
	  public static final int LADDER =1;
	  public static final int SNAKE  =2;
	  public static final int NO_PLAY=3;
	  
	    public static void main(String[] args)	
		   {
				 //Variables
				 int position=0;
				 int random;
				 int choice;
				 
              while(position>=0 && position<100)
              {
				     random = (int) ( (Math.floor(Math.random() *10 ) % 6) +1 );
				     choice = (int) ( Math.floor(Math.random() *10 ) % 3) +1;
				     
				      switch (choice)
				       {
				          case LADDER :
				           {  position = position + random ;
					          break; 
				            }
				          case SNAKE :
				           {  
	                       	  position = position - random;
	                       	    if(position<0)
	                       	     { position =0;} 
				              break ;
				             }
				           case NO_PLAY :
				             break ;
				          }
                }
			     if(position>=100)
			     { System.out.println("Player has won the game "); }
		   }
  }
 
