package cs245.Appler;

public class Main {//Main class used to play Craps

    public static void main(String[] args) {
	    CrapsGame cg = new CrapsGame();//Creates craps game
        float count = 0;//Starts counter for total wins
        boolean outcome;//The result returned from craps game true=win false=loss
        int numGames = 100000;//Number of games to be played
	    for (int i = 0; i < numGames; i++){//For loop for playing numGames
            outcome = cg.play();
	        if(outcome){
	            count ++;//Adds 1 to count for every win
            }
        }
	    System.out.println("Craps Winning Percentage = " + (count/numGames)*100 + "%");//Returns the percent of wins

    }
}
