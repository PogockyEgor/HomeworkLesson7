public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.setHealPLan(2);

        Therapist therapist = new Therapist();
        therapist.solution(patient);
    }
}