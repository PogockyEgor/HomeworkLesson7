public class Therapist extends Doctor{

    @Override
    public void heal() {
        System.out.println("Пациента лечит терапевт");
    }

    public void solution(int healPlan){
        if(healPlan==1){
            System.out.println("Лечить будет хирург");
            Surgeon surgeon = new Surgeon();
            surgeon.heal();
        }
        else if (healPlan==2){
            System.out.println("Лечить будет дантист");
            Dentist dentist = new Dentist();
            dentist.heal();
        }
        else{
            System.out.println("Лечить будет терапевт");
            Therapist therapist = new Therapist();
            therapist.heal();
        }


    }
}
