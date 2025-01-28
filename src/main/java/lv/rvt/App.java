package lv.rvt;
import java.util.ArrayList;

public class App{

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        
        persons.add(new Teacher("Ada Lovelace", 37, 1200));
        persons.add(new Student("John Doe", 20));

        printPersons(persons);
    }
}