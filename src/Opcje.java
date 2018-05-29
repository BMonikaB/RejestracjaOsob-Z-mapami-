import java.util.HashMap;
import java.util.Map;

public class Opcje {

    private Map<String, Dane> osoby = new HashMap();


    public void addPerson(Dane dane){
        String key = dane.getName() +" " + dane.getLastName();
        osoby.put(key, dane);
    }

    public void printPerson(){

        System.out.println("Dane osob na liscie :");
        for (String d : osoby.keySet()){
            System.out.println(d+ " c ");
        }
    }



    public Dane findPerson(String name, String lastName){
        String key = name+" " + lastName;
        return osoby.get(key);

    }

}
