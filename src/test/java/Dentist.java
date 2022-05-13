import java.util.ArrayList;
import java.util.Objects;

public class Dentist {
    ArrayList<String[]> assistant = new ArrayList<>();
    private final int appointment ;

    public Dentist() {
        this.appointment = 0;
    }

    public void newAppointment(String patientName, String timestamp1) {
        String[] info = {patientName, "0"};
        assistant.add(info);
    }

    public <patientName1> void resign(String  patientName1) {
        String patientName = null;
        int index = getIndex(null,appointment);
        if(index != -1)
            assistant.remove(index);
    }

    public String getAppointments () {
        StringBuilder s = new StringBuilder();

        for (int i=0; i<assistant.size(); i++) {
            if (i+1 != assistant.size())
                s.append(assistant.get(i)[0]).append(" 0\r\n");
            else {
                s.append(assistant.get(i)[0]).append(" 0");
            }
        }

        return s.toString();
    }

    public int getIndex(String patientName, int appointment) {
        for (int i=0; i<assistant.size(); i++) {
            if (Objects.equals(assistant.get(i)[0], patientName))
                return i;
        }
        return -1;
    }




}