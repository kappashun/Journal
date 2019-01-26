
public class Participant extends Person {
    int cardID;
    public Participant(){
        cardID = 0;
    }
    public Participant(int cardID, Person person){
        fio = person.fio;
        phone = person.phone;
        this.cardID = cardID;


    }
}
