import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BeverageMachine {

    String bevname;

    ArrayList<String> beverage = new ArrayList<String>();

    public String calories(String k){

        if (new String(k).equals("coffee")) {
            CoffeeCup c = new CoffeeCup();
            return c.Calories();
        }
        else if(new String(k).equals("tea")){
            TeaCup t  = new TeaCup();
            return t.Calories();
        }
        return "";


    }

    public int beverageCups(){
        Set<String> distinct = new HashSet<>(beverage);
        return (Collections.frequency(beverage,"coffee")+Collections.frequency(beverage,"tea"));
    }
}
