public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field

    public  ToDoItem(String _description) {
        isDone = false;
        _description = description;

    }

    public void setDescription(String _description) {
        description = _description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone(){
        return  isDone;
    }

    public void setDone(){
        isDone = true;
    }

    public  void setUndone(){
        isDone = false;
    }
}
