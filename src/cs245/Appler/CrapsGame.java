package cs245.Appler;

public class CrapsGame {//CrapsGame class
    private int FirstRoll;
    private Dice Die1 = new Dice();
    private Dice Die2 = new Dice();

    public CrapsGame() {//Default Constructor
        FirstRoll = -1;
    }

    public boolean play() {//Plays a game of Craps
        int CurrentRoll = -1;
        FirstRoll = (Die1.roll() + Die2.roll());//Finds first roll
        if (FirstRoll == 7 || FirstRoll == 11) {
            return (true);
        }//Checks to see if the person won
        else if (FirstRoll == 2 || FirstRoll == 3 || FirstRoll == 12) {
            return (false);
        }//Checks to see if the person lost
        while (CurrentRoll != 7) {//Continues until the person either rolls a 7 or the CurrentRoll equals the FirstRoll
            CurrentRoll = (Die1.roll() + Die2.roll());
            if (FirstRoll == CurrentRoll) {
                return (true);
            }//Wins
        }
        return (false);//Loses
    }

}