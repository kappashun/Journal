
public class Employee extends Participant{
    String job;
    public Employee(String job, Participant part){
        cardID = part.cardID;
        this.job = job;
    }
}
