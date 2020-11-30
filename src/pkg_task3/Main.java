package pkg_task3;

public class Main {
    public static void main(String[] args) {
        Recodable player1 = new Player("Track name 1", "Composer name1");
        Playable player2 = new Player("Track name 1", "Composer name1");

        System.out.println("Record");
        player1.record();
        player1.stop();
        player1.record();
        player1.pause();
        player1.record();
        player1.stop();
        System.out.println();

        System.out.println("Play");
        player2.play();
        player2.stop();
        player2.play();
        player2.pause();
        player2.play();
        player2.stop();

    }
}
