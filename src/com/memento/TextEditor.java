package com.memento;

public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getTextState();
    }
}
