public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String first, String last, int ag){
        firstName = first;
        lastName = last;
        age = ag;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return(firstName + " " + lastName + ", " + age);
    }
}
