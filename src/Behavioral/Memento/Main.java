package Behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("Initial text.");
        
        History history = new History();
        
        history.addMemento(editor.saveStateToMemento());
        
        editor.setText("Text after modification.");
        System.out.println("Current text: " + editor.getText());
        
        history.addMemento(editor.saveStateToMemento());
        
        editor.setText("Another modification of text.");
        System.out.println("Current text: " + editor.getText());
        
        history.addMemento(editor.saveStateToMemento());
        
        editor.restoreStateFromMemento(history.getMemento(1));
        System.out.println("Restored text: " + editor.getText());
        
        editor.restoreStateFromMemento(history.getMemento(0));
        System.out.println("Restored to initial text: " + editor.getText());
    }
}
