package employee;

import java.util.Date;

public class Chef extends Employee {
    private boolean receivedKnifeSet = false;

    public Chef(String name, Date birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public void setReceivedKnifeSet(boolean receivedKnifeSet) {
        this.receivedKnifeSet = receivedKnifeSet;
    }

    public boolean isYelling() {
        return getRandom().nextBoolean();
    }

    @Override
    public String toString() {
        return "Position: Chef - " + "Name: " + getName() + " - Received knife set: " + receivedKnifeSet;
    }

}
