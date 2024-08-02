class Main {
    // ... (other methods and fields)

    public static void onLogIn() {
        System.out.print("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        User user = authService.logIn(username, password);
        System.out.println("Welcome, " + user.getUsername() + "!");
        // TODO Now: Create an instance of the ToDoList class with the logged-in user and call the run method
    }
}
