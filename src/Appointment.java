public class Appointment {
    int appointmentId;
    String patientName;
    String doctorName;

    public Appointment(int appointmentId, String patientName, String doctorName) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
    }
}