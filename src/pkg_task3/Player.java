package pkg_task3;

public class Player implements Playable, Recodable {
    String trackName;
    String composerName;

    public void play() {
        System.out.println("Playing track: " + trackName + " (" + composerName + ")");
    }

    public void record() {
        System.out.println("Recording track: " + trackName + " (" + composerName + ")");
    }

    public void pause() {
        System.out.println("Pause");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public Player(String trackName, String composerName) {
        this.trackName = trackName;
        this.composerName = composerName;
    }
}