
import java.util.ArrayList;

public class User {
    // ... (other fields and methods)

    private String _username;
    private String _password;

    private ArrayList<ToDoItem> toDoItems;

    public User(String username, String password) {
        // ... (other initializations)
        _username = username;
        _password = password;
        this.toDoItems = new ArrayList<>();
    }

    /**
     * Gets the to-do items of the user.
     *
     * @return A reference to the list of to-do items, which can be modified from outside the class.
     */
    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }

    public String getUsername() {
        return _username;
    }


}
