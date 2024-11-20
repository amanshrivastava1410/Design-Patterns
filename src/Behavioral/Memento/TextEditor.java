package Behavioral.Memento;

public class TextEditor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TextState saveStateToMemento() {
        return new TextState(text);
    }

    public void restoreStateFromMemento(TextState memento) {
        text = memento.getText();
    }
}