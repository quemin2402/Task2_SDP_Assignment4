package com.memento;

import java.util.Stack;

public class History {
    private Stack<Memento> historyStack = new Stack<>();

    public void save(Memento memento) {
        historyStack.push(memento);
    }

    public Memento undo() {
        if (!historyStack.isEmpty()) {
            return historyStack.pop();
        }
        return null;
    }

    public boolean hasUndo() {
        return !historyStack.isEmpty();
    }
}
