package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<TextState> historyList = new ArrayList<>();

    public void addMemento(TextState memento) {
        historyList.add(memento);
    }

    public TextState getMemento(int index) {
        return historyList.get(index);
    }
}