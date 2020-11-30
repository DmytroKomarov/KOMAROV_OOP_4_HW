package pkg_task2;

public class XMLHandler extends AbstractHandler {

    void open() {
        System.out.println("Opened XML-type doc");
    }

    void create() {
        System.out.println("Created XML-type doc");
    }

    void change() {
        System.out.println("Changed XML-type doc");
    }

    void save() {
        System.out.println("Saved XML-type doc");
    }
}
