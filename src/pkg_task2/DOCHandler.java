package pkg_task2;

public class DOCHandler extends AbstractHandler {

    void open() {
        System.out.println("Opened DOC-type doc");
    }

    void create() {
        System.out.println("Created DOC-type doc");
    }

    void change() {
        System.out.println("Changed DOC-type doc");
    }

    void save() {
        System.out.println("Saved DOC-type doc");
    }
}

