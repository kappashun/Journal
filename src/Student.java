
public class Student extends Participant{
    Parent[] parents;
    public Student(Participant part, Parent[] parents){
        cardID = part.cardID;
        fio = part.fio;

    }
}
