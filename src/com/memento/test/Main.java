package com.memento.test;

import com.memento.History;
import com.memento.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History();

        textEditor.setText("Hello, world!");
        history.save(textEditor.save());

        System.out.println("Current Text: " + textEditor.getText());

        textEditor.setText("Hello, Memento Pattern!");
        history.save(textEditor.save());

        System.out.println("Updated Text: " + textEditor.getText());

        if (history.hasUndo()) {
            textEditor.restore(history.undo());
            System.out.println("After Undo: " + textEditor.getText());
        }

        if (history.hasUndo()) {
            textEditor.restore(history.undo());
            System.out.println("After Second Undo: " + textEditor.getText());
        }
    }
}
