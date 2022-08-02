package Assignment.Codes;

import java.util.Scanner;

class Guesser{

    int guessNum;
    public int GuessingNUmber(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Provide The Guessing Number between 0 - 10 :");   
     guessNum = sc.nextInt();
     while (guessNum>10){
            System.out.println("Please provide Numbers Between 0 - 10 :");
            guessNum = sc.nextInt();
     }
        return guessNum;
    }
}
class Player{
    int playerGuess;
    int playersPlaying;
    Scanner sc = new Scanner(System.in);
    public int numberOfPlayers(){
        System.out.println("How Many Players Are Playing :");
        playersPlaying = sc.nextInt();
        return playersPlaying;
    }

    public int playerGuessed(){
        
        System.out.println("Please Guess the Number between 0 - 10 to Win the Game;");
        playerGuess = sc.nextInt();
        while (playerGuess > 10){
            System.out.println("Please provide Numbers Between 0 - 10 :");
            playerGuess = sc.nextInt();
        }
        return playerGuess;
    }


}

class Umpire{
    int numFromguesser;
    
    Player p = new Player();
    Guesser g = new Guesser();
    int NumberOfP = p.numberOfPlayers();
    int []PlayersNum = new int[NumberOfP]; 
    
    public void guesserNumber(){
        
        numFromguesser = g.GuessingNUmber();
    
    }

    public void playersguessedNumber(){
        for(int i = 0 ; i < PlayersNum.length; i++){
            PlayersNum[i] = p.playerGuessed();
        
        }
    }

    public void findingWinner(){
        int count = 0;
        for(int i: PlayersNum){
            count += 1;
            if(numFromguesser == i){
                System.out.println("Player " + count + " won the Game");
            }
        }
        }
    }


public class Assignment2 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Umpire ump = new Umpire();
        ump.guesserNumber();
        ump.playersguessedNumber();
        ump.findingWinner();
    }
    
}

