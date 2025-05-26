package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Directory apoo = new Directory("apoo");
        File file1 = new File("Refactoring.md");
        File file2 = new File("Como aumentar o antebraço.json");
        File file3 = new File("Design Patterns.md");
        File file4 = new File("Clash of clans base atualizada.txt");

        apoo.add(file1, file2, file3);

        cliente.rmrf(file4);

        cliente.rmrf(apoo);
    }
}
