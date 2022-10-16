public class Therapist extends Doctor {

    @Override
    public void heal() {
        System.out.println("Пациента лечит терапевт");
    }

    public void solution(Patient patient) {
        if (patient.getHealPLan() == 1) {
            System.out.println("Лечить будет хирург");
            patient.setDoctor(new Surgeon());
        } else if (patient.getHealPLan() == 2) {
            System.out.println("Лечить будет дантист");
            patient.setDoctor(new Dentist());
        } else {
            System.out.println("Лечить будет терапевт");
            patient.setDoctor(new Therapist());
        }
        patient.getDoctor().heal();


    }
}
