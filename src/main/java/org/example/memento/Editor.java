package org.example.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        stateHistory = new ArrayDeque<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }
}
