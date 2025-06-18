package org.example.memento;

public class Memento {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Hello World");
        editor.write("World");
        editor.undo();
    }
}
