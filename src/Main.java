import java.util.Scanner;

public class Main {
    static String[] mark = {" ", " " , " ", " ", " ", " ", " ", " ", " "};
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("LUFFARSCHACK");
        System.out.println("1. Play" +
                           "\n2. Quit");
        String choice = input.next();
        switch (choice) {
            case "1": {
                boolean isRunning = true;
                while (isRunning) {
                    paintBoard();
                    player1();
                    paintBoard();
                    player2();
                }
                break;
            }
            case "2": {
                System.exit(0);
                break;
            }
        }

    }

    public static void paintBoard() {
        System.out.println(mark[0] + " | " + mark[1] + " | " + mark[2] + " // 123");
        System.out.println("_________");
        System.out.println(mark[3] + " | " + mark[4] + " | " + mark[5] + " // 456");
        System.out.println("_________");
        System.out.println(mark[6] + " | " + mark[7] + " | " + mark[8] + " // 789");
    }

    public static void player1() {
        System.out.print("Player 1 choose a number to put your mark: ");
        int nr = input.nextInt();
        mark[(nr-1)] = "x";
    }
    public static void player2() {
        System.out.print("Player 2 choose a number to put your mark: ");
        int nr = input.nextInt();
        mark[(nr-1)] = "o";
    }
}