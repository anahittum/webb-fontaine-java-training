package week3.homework3.persons;

public class Person {

    String name;
    Company company;
    int age;


    public static void arrayToString(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", company=" + company +
                ", age=" + age +
                '}';
    }
}
