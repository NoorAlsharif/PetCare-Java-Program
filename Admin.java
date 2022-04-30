
import java.util.ArrayList;

public class Admin extends User {

    private appState state;

    private ArrayList<Appointment> groomingApp;

    private ArrayList<Appointment> vetApp;

    public Admin() {
    }

    public appState changeState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public User addUser(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Appointment addApp(Appointment appointmennt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Appointment removeApp(Appointment appointment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Appointment updateApp(Appointment appointment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
