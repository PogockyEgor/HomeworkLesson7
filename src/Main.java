public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.setHealPLan(5);
        Therapist therapist = new Therapist();
        therapist.solution(patient.getHealPLan());
    }
}