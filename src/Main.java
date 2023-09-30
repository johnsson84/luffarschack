public class Main {
    static String[] mark = {" ", " " , " ", " ", " ", " ", " ", " ", " "};

    public static void main(String[] args) {
        paintBoard();
    }

    public static void paintBoard() {
        System.out.println(mark[0] + " | " + mark[1] + " | " + mark[2]);
        System.out.println("_________");
        System.out.println(mark[3] + " | " + mark[4] + " | " + mark[5]);
        System.out.println("_________");
        System.out.println(mark[6] + " | " + mark[7] + " | " + mark[8]);
    }
}