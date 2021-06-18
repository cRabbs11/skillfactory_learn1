import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

    private static int idCount;
    private String model;
    private String description;
    private String clientContact;
    private String date;
    private boolean isDone;

    private int id;

    public Phone(String description, String clientContact, String date) {
        this(description, clientContact, date, "unknown");
    }

    public Phone(String description, String clientContact, String date, String model) {
        this.model = model;
        this.description = description;
        this.clientContact = clientContact;
        this.date = date;
        idCount++;
        id= idCount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClientContact() {
        return clientContact;
    }

    public void setClientContact(String clientContact) {
        this.clientContact = clientContact;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }
}
