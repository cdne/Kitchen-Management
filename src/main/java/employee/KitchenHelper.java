package employee;



import java.util.Date;
import java.util.Random;

public class KitchenHelper extends Employee{
    Random rand = new Random();

    private boolean canIGiveIngredient = true;
    private int carrot = rand.nextInt(4);
    private int meat = rand.nextInt(4);
    private int potato = rand.nextInt(4);

    public boolean canIGiveIngredient() {
        return canIGiveIngredient;
    }


    public KitchenHelper(String name, Date newDate,int salary){
        super(name, newDate, salary);
    }

    public void giveIngredient(String ingredient){
        if((ingredient.equalsIgnoreCase("carrot"))){
            if(carrot != 0) carrot -= 1;
            else canIGiveIngredient = false;
        } else if(ingredient.equalsIgnoreCase("potato")){
            if(potato != 0) potato -= 1;
            else canIGiveIngredient = false;
        } else if(ingredient.equalsIgnoreCase("meat")){
            if(meat != 0) meat -= 1;
            else canIGiveIngredient = false;
        }
    }

    @Override
    public String toString() {
        return "Position: Kitchen Helper - Name: " + this.getName();
    }
}
