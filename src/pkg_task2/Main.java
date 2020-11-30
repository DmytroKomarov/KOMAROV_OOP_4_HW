package pkg_task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input doc type: ");
        System.out.println("1 - XML-type, 2 - TXT-type, 3 - DOC-type");

        Scanner sc = new Scanner(System.in);
        int docType = sc.nextInt();

        switch (docType) {
            case 1:
                AbstractHandler xmlHandler = new XMLHandler();
                xmlHandler.open();
                xmlHandler.create();
                xmlHandler.change();
                xmlHandler.save();
                break;
            case 2:
                AbstractHandler txtHandler = new TXTHandler();
                txtHandler.open();
                txtHandler.create();
                txtHandler.change();
                txtHandler.save();
                break;
            case 3:
                AbstractHandler docHandler = new DOCHandler();
                docHandler.open();
                docHandler.create();
                docHandler.change();
                docHandler.save();
                break;
        }
    }
}
