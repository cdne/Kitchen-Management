import employee.Chef;
import employee.Cook;
import employee.Employee;
import employee.KitchenHelper;

import java.util.*;


public class Restaurant {
    static List<KitchenHelper> kitchenHelperArrayList = new ArrayList<>();
    static Random random = new Random();
    static String[] ingredient = new String[]{"meat", "potato", "carrot"};
    static List<Cook> cookList = new ArrayList<>();

    public static void main(String[] args) {
        // hiring chef
        Chef chef = new Chef("Anthony Benninger", new Date(1960-3-22), 4510);

        // hiring cooks
        Cook cook = new Cook("Mark Jimenez", new Date(1975-5-31), 3100);
        Cook cook2 = new Cook("Ann Roger", new Date(1981-2-16), 2800);
        Cook cook3 = new Cook("Kenneth Georges", new Date(1970-8-18), 2300);

        cookList.add(cook);
        cookList.add(cook2);
        cookList.add(cook3);

        // hiring kitchen helpers
        KitchenHelper helper = new KitchenHelper("Jonathan Koepp", new Date(1980-1-2), 1223);
        KitchenHelper helper2 = new KitchenHelper("Anne Thomas", new Date(1990-10-21), 1420);
        KitchenHelper helper3 = new KitchenHelper("Paul Worthington", new Date(1995-12- 22), 1322);

        kitchenHelperArrayList.add(helper);
        kitchenHelperArrayList.add(helper2);
        kitchenHelperArrayList.add(helper3);


        // printing hired employees
        System.out.println("Hired "+ chef.getName());
        cookList.forEach(cooks -> System.out.println("Hired " + cooks.getName()));
        kitchenHelperArrayList.forEach(helpers -> System.out.println("Hired " + helpers.getName()));

        System.out.println();

        // check if chefs or cooks received their knife sets
        chef.setReceivedKnifeSet(random.nextBoolean());
        for(Cook eachcook : cookList){
            eachcook.setReceivedKnifeSet(random.nextBoolean());
        }

        // show if chef and cooks received knife set
        System.out.println(chef);
        cookList.forEach(System.out::println);

        System.out.println();

        // true or false if chef is yelling
        if(chef.isYelling()){

            int helperCount = 0;
            String currentIngredient = ingredient[random.nextInt(ingredient.length)];

            // if chef asks for an ingredient
            System.out.println("Chef is yelling and asks for " + currentIngredient);

            for(KitchenHelper kitchenHelper : kitchenHelperArrayList){
                kitchenHelper.giveIngredient(currentIngredient);
                if(!kitchenHelper.canIGiveIngredient()){
                    helperCount++;
                } else {
                    System.out.println(kitchenHelper.getName() + " gives " + currentIngredient + " to chef");
                    break;
                }
                if(helperCount == 3){
                    kitchenHelperArrayList.stream()
                            .map(Employee::getName)
                            .forEach(name -> System.out.println(name + ": we're all out"));
                }
            }
        }

        // new line
        System.out.println();

        // create tax report for each employee
        chef.createTaxReport();

        System.out.println("Position: Chef - " + chef.getName() + " you need to pay " + chef.createTaxReport() + " in taxes.");

        cookList.forEach(eachcook -> System.out.println("Position: Cook - " + eachcook.getName() + " you need to pay "
                        + eachcook.createTaxReport() + " in taxes."));

        kitchenHelperArrayList.forEach(eachKitchenHelper -> System.out.println("Positon: Kitchen Helper - "+
                eachKitchenHelper.getName() + " you need to pay " + eachKitchenHelper.createTaxReport() + " in taxes."));
    }
}
