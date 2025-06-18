package org.example.visitor;

public class VisitorUsage {
    public static void main(String[] args) {
        Tablet ipad = new Ipad("6.8", "2023");
        Tablet ipad2 = new Ipad("6.8", "2019");
        Tablet samsungTab = new SamsungTab("5.5", "2023");

        Visitor softwareChecker = new SoftwareUpdatingVisitor();
        System.out.println("Verificando iPad:");
        ipad.accept(softwareChecker);

        System.out.println("Verificando iPad:");
        ipad2.accept(softwareChecker);

        System.out.println("Verificando SamsungTab:");
        samsungTab.accept(softwareChecker);
    }
}
