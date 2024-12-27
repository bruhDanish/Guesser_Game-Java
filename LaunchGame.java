// import java.util.Scanner;

// class Player
// {
//     int numGuess;
//     public void guessNumber()    
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Hey Player, guess a number between 0 and 9");
//         numGuess = sc.nextInt();
//     }
// }

// class Guesser
// {   
//     int numGuess;
//     public void guessNumber()
//     {
//         int guessNumber;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Hey Guesser, guess a number between 0 and 9");
//         numGuess = sc.nextInt();
//     }
// }

// class Umpire
// {
//     Guesser guesser;
//     Player p1, p2, p3;

//     public void getNumberFromGuesser()
//     {
//         guesser = new Guesser();
//         guesser.guessNumber();
//     }

//     public void collectFromPlayers()
//     {   
//         p1 = new Player();
//         p2 = new Player();        
//         p3 = new Player();
//          p1.guessNumber();
//          p2.guessNumber();
//          p3.guessNumber();
//     }

//     public void calcResult()
//     {   
//         System.out.println(guesser.numGuess + " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
//         if(guesser.numGuess == p1.numGuess)
//         {
//             if (guesser.numGuess == p2.numGuess && guesser.numGuess == p3.numGuess)
//                 System.out.println("It's a tie");
//             else if(guesser.numGuess == p2.numGuess)
//                 System.out.println("Player 1 and Player 2 wins");
//             else if(guesser.numGuess == p3.numGuess)
//                 System.out.println("Player 1 and Player 3 wins");
//             else
//                 System.out.println("Player 1 wins");
//         }
//         else if(guesser.numGuess == p2.numGuess)
//         {
//             if(guesser.numGuess == p3.numGuess)
//                 System.out.println("Player 2 and Player 3 wins");
//             else
//             System.out.println("Player 2 wins");
//         }
//         else if(guesser.numGuess == p3.numGuess)
//         {
//             System.out.println("Player 3 wins");
//         }
//         else
//         {
//             System.out.println("Guesser wins");
        
//         }
//     }   
// }


// public class LaunchGame{
    
//     public static void main(String[] args) {
        
//         Umpire umpire = new Umpire();
//         umpire.getNumberFromGuesser();
//         umpire.collectFromPlayers();
//         umpire.calcResult();

//     }

// }

import java.util.Scanner;

class Player
{
    int numGuess;
    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey player, guess the number");
        numGuess = sc.nextInt();
    }
    
}

class Guesser
{
    int numGuess;
    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey guesser, guess the number");
        numGuess = sc.nextInt();       
    }

}

class Umpire
{
    Guesser guesser;
    Player p1, p2, p3;
    public void getNumberFromGuesser() {
        guesser = new Guesser();
        guesser.guessNumber();  
    }

    public void collectFromPlayers() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        p1.guessNumber();
        p2.guessNumber();
        p3.guessNumber();
        
    }

    public void calcResult() 
    {
        System.out.println(guesser.numGuess + " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
        if (guesser.numGuess == p1.numGuess) {
            if (guesser.numGuess == p2.numGuess && guesser.numGuess == p3.numGuess)
                System.out.println("All are correct.");
            else if(guesser.numGuess == p2.numGuess)
                System.out.println("Player 1 and 2 are the winners.");
            else if(guesser.numGuess == p3.numGuess)
                System.out.println("Player 1 and 3 are the winners.");
            else
                System.out.println("Player 1 is the winner.");
        }
        else if(guesser.numGuess == p2.numGuess){
            if(guesser.numGuess == p3.numGuess)
                System.out.println("Player 2 and 3 are the winners.");
            else
                System.out.println("Player 2 is the winner.");
        }
        else if(guesser.numGuess == p3.numGuess){
            System.out.println("Player 3 is the winner.");
        }
        else{
            System.out.println("nobody won");
        }
    }
    
}


public class LaunchGame{

    public static void main(String[] args) {
        
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayers();
        umpire.calcResult();


    }

}

