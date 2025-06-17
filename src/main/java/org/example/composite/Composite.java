package org.example.composite;

public class Composite {
    public static void main(String[] args) {
        FileRemover fileRemover = new FileRemover();

        Directory apoo = new Directory("apoo");
        File file1 = new File("Refactoring.md", "this is the content of the file");
        File file2 = new File("Como aumentar o antebraço.json", "é só fazer exercicios blablabla");
        File file3 = new File("Design Patterns.md", "o padrão de projeto compositeblablabla");
        File file4 = new File("Clash of clans base atualizada.txt", "isso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txtisso nao deveria ser um txt");

        apoo.add(file1, file2, file3);

        apoo.printSize();
        apoo.printStructure();
        file1.printContents();
        file4.printSize();

        fileRemover.remove(file4);

        fileRemover.remove(apoo);
    }
}
