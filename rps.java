import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
Random rand = new Random();
String bot = "rock";
 int botc = rand.nextInt(1,4);

switch (botc) {
case 1 -> bot = "rock";
case 2 -> bot = "paper";
case 3 -> bot = "scissors";

}



 
 String win = "What";
        Scanner scanner = new Scanner(System.in);
 System.out.print("Do rock paper or scissors: ");

 String Input = scanner.next();

switch (Input) {
case "rock" -> {
    if (bot.equals("rock")) {
        win = "You Tied";
    }
     if (bot.equals("paper")) {
        win = "You lose";
    }
    if (bot.equals("scissors")) {
        win = "You Win";
    }           
}   
case "paper" -> {
 if (bot.equals("rock")) {
        win = "You Win";
    }
     if (bot.equals("paper")) {
        win = "You Tied";
    }
    if (bot.equals("scissors")) {
        win = "You Lose";
    }    
} 
case "scissors" ->{
 if (bot.equals("rock")) {
        win = "You Lose";
    }
     if (bot.equals("paper")) {
        win = "You Win";
    }
    if (bot.equals("scissors")) {
        win = "You Tied";
    } 
}
default -> win = "WHAT";
}
System.out.println(win);    
}}
