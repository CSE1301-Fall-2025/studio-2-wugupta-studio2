import java.util.Scanner;
public class Ruin {

    public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    int days;
    int DayWin = 0;
    int DayRuin = 0;
    System.out.println("How many days are you planning to go to the casino?");
    days = scan.nextInt();
    for (int casinotime = 0;casinotime < days;casinotime++) {
    int startAmount = 3;
        double winChance = 0.5;
        int winLimit = 5;
        int ruin = 0;
        int Success = 0;
        int Loss = 0;
        int Amount;
        Amount = startAmount;
    while(Amount < winLimit && Amount > ruin) {
        int coinflip = (int)(Math.random()*2 + 1);
        if (coinflip == 1) {
            Amount = Amount + 1;
            System.out.println("Heads - You won!");
            Success++;
        }
        else {
            Amount = Amount -1;
            System.out.println("Tails - You lose");
            Loss++;
        }
    }
    System.out.println("You had " + Success + " Wins & " + Loss + " Losses");
        if (Loss > Success) {
            System.out.println("You Ruined");
            DayRuin++;
        }
        else {
            System.out.println("You Won!");
            DayWin++;
        }
    }
    System.out.println("You Won " + DayWin + " days. And You Ruined " + DayRuin + " days.");
    }
}
