public class User {
    // ... (other fields and methods)

    private ArrayList<ToDoItem> toDoItems;

    public User(String username, String password) {
        // ... (other initializations)
        this.toDoItems = new ArrayList<>();
    }

    /**
     * Gets the to-do items of the user.
     * @return A reference to the list of to-do items, which can be modified from outside the class.
     */
    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }
}
