package com.memento;

public class Memento {
    private final String textState;

    public Memento(String textState) {
        this.textState = textState;
    }

    public String getTextState() {
        return textState;
    }
}
