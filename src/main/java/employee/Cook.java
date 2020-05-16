package employee;

import java.util.Date;

public class Cook extends Employee{
    private boolean receivedKnifeSet = false;

    public Cook(String name, Date birthDate, int salary){
        super(name, birthDate, salary);
    }

    public void setReceivedKnifeSet(boolean receivedKnifeSet) {
        this.receivedKnifeSet = receivedKnifeSet;
    }

    @Override
    public String toString() {
        return "Position: Cook - " + "Name: " + getName() + " - Received knife set: " + receivedKnifeSet;
    }
}
