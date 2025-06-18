package org.example.memento;

public class TextArea {
    private String text;
    public void setText(String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }

    public static class Memento {
        private String text;
        private Memento(String text) {
            this.text = text;
        }

        private String getSavedText() {
            return text;
        }
    }
}
