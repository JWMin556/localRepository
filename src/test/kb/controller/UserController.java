public class UserController {
    public void createUser(String name, int age) {
        User user = new User(name, age);
        System.out.println("User Created: " + user.getName());
    }
}
