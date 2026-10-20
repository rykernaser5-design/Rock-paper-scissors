import java.util.Scanner;
import java.util.Random;

public class rps {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
String player;
        System.out.print("Choose Rock Paper or Scissors: ");
do {

    player = scanner.nextLine();
    if (!(player.equals("N")))        {
            String robot;
int robot1 = random.nextInt(1, 4);
        if (robot1 == 1) {
            robot = "Rock";
        } else if (robot1 == 2) {
            robot = "Paper";
        } else {robot = "Scissors";}
            System.out.println("AI choose " + robot + "!");
if (player.equals(robot)) {
    System.out.println("Its a tie!");
} else if (robot.equals("Rock") && (player.equals("Paper")) || robot.equals("Paper") && (player.equals("Scissors")) || robot.equals("Scissors") && (player.equals("Rock")))
    {
        System.out.println("You win!");
    } else {
    System.out.println("You lose!");
}
            System.out.print("Rock Paper or Scissors (N to stop): ");
}} while (!(player.equals("N")));
        System.out.println("Bye Bye!");
scanner.close();
    }}
