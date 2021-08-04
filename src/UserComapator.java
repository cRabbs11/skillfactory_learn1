import java.util.Comparator;

public class UserComapator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.login.compareTo(o2.login);
    }
}
