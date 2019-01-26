
public class Teacher extends Participant{
    String job;
    String kval;
    public Teacher(Participant part, String job, String kval){
        cardID = part.cardID;
        fio = part.fio;
        this.job = job;
        this.kval = kval;
    }
}
