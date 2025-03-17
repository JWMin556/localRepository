public class UserService {
    private UserDao userDao = new UserDao();
    
    public void registerUser(User user) {
        userDao.save(user);
    }
}
