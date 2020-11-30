package pkg_task2;

public class TXTHandler extends AbstractHandler {

    void open() {
        System.out.println("Opened TXT-type doc");
    }

    void create() {
        System.out.println("Created TXT-type doc");
    }

    void change() {
        System.out.println("Changed TXT-type doc");
    }

    void save() {
        System.out.println("Saved TXT-type doc");
    }
}
