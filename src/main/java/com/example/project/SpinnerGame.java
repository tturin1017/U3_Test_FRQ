package com.example.project;

public class SpinnerGame{
    public SpinnerGame(){}

    /*Precondition: min < max
    Simulates a spin of a spinner by returning a random integer
    between min and max, inclusive
    */
    public int spin(int min, int max){
    /* to be implemented in part (a) */ 
        int result;
        result = (int) (Math.random()*(max-min)+1)+min;
        return result;
    }

    /** Simulates one round of the game as described in part (b).
    */
    public void playRound(int playerSpin1, int computerSpin1, int playerSpin2, int computerSpin2){ 
        /* to be implemented in part (b) */

        /*It is difficult to test the output of this method with random values 
        I will have to use the 4 parameters above. They should integrate into your method
        seamlessly...You can however, CHANGE THE NAMES of the parameters to work with your method!
        I will be checking your FRQ response to make sure you declared
        and initialized your variables and assigned them to a call from your spin() method
        */
        int result = playerSpin1 - computerSpin1;
        if(result == 0){
            if(playerSpin1+playerSpin2> computerSpin1 + computerSpin2){
                System.out.println("You win! 1 points");
            }
            else if (computerSpin1 + computerSpin2 > playerSpin1 + playerSpin2 ){
                System.out.println("You lose. -1 points");
            }else{
                System.out.println("Tie. 0 points");
            }
        }else if(result > 0){
            System.out.println("You win! " + result + " points");
        }else{
            System.out.println("You lose. " + result + " points");
        } 
    }
}