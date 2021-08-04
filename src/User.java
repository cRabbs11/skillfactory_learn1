import java.util.Objects;

public class User {

    public final String login;
    private final int id;
    private static int idCount;

    public User(String login) {
        this.login = login;
        id = ++idCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, id);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                '}';
    }
}
