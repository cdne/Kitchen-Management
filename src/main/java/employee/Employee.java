package employee;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class Employee {
    private String name;
    private Date birthDate;
    private int salary;
    private Random random;

    Employee(String name, Date birthDate, int salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public Random getRandom() {
        return new Random();
    }

    public String getName() {
        return name;
    }

    public float createTaxReport() {
        return salary * 0.99f;
    }
}
