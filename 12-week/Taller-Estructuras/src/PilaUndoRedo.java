import java.util.Stack;

public class PilaUndoRedo {
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public PilaUndoRedo() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Ejecuta una acción (p. ej. escribir texto) y la guarda para poder deshacerla
    public void doAction(String action) {
        undoStack.push(action);
        
        redoStack.clear();
    }

    // Deshacer: mueve la última acción a redoStack y la "retorna" como acción deshecha
    public String undo() {
        if (undoStack.isEmpty()) {
            return null; 
        }
        String action = undoStack.pop();
        redoStack.push(action);
        return action;
    }

    // Rehacer: recupera la última acción deshecha
    public String redo() {
        if (redoStack.isEmpty()) {
            return null; 
        }
        String action = redoStack.pop();
        undoStack.push(action);
        return action;
    }

    public static void main(String[] args) {
        PilaUndoRedo ed = new PilaUndoRedo();
        ed.doAction("Escribir 'Hola'");
        ed.doAction("Escribir ' Mundo'");
        System.out.println("Undo: " + ed.undo()); // deshace "Escribir ' Mundo'"
        System.out.println("Redo: " + ed.redo()); // rehace "Escribir ' Mundo'"
    }
}
