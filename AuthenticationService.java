public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user

    public void InitialiseUsers() {
        users.add("test", "test");
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise

    public User signUp(String username, String password) {
        for (int i = 0; i < users.length(); i++) {
            if (username == users.get(i))
                return null;
        }
        return users.add(username, password);
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise

    public User logIn() {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).contains(username) && users.get(i).contains(password))
                if (password == users.get(i)) {
                    return users.get(i);
                }
        }
    }
}