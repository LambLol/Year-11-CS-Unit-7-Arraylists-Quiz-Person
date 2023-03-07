import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        int size = allPersons.size();
        //Sort by last name
        for (int i = 0; i < allPersons.size(); i++){
            if ((person.getLastName().compareTo(allPersons.get(i).getLastName()) < 0) && (allPersons.size() == size)){
                allPersons.add(i, person);
            }
        }
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under = new ArrayList<>();
        for(Person temp : allPersons){
            if(temp.getAge() < 18){
                under.add(temp);
            }
        }
        return(under);
    }

    public boolean checkLastName(String lastName) {
        for(Person temp : allPersons){
            if(temp.getLastName().equals(lastName)){
                return(true);
            }
        }
        return(false);
    }
}
