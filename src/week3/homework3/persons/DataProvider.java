package week3.homework3.persons;


class DataProvider {


    private static String[] names = {"A", "B", "C", "D", "E", "F"};
    private static String[] companyNames = {"Comp1", "Comp2", "Comp3", "Comp4", "Comp5", "Comp6"};
    private static String[] companyAddresses = {"AddA", "AddB", "AddC", "AddD", "AddE", "AddF"};
    private static String[] companyCEOs = {"CEO1", "CEO2", "CEO3", "CEO4", "CEO5", "CEO6"};

    static Person[] persons = new Person[10];

    static {
        for (int i = 0; i < persons.length; i++) {
            int random = (int) (Math.random() * 6);

            Person person = create(names[random], (int) (Math.random() * 100));

            person.company = new Company(
                    companyNames[random],
                    create(companyCEOs[random], (int) (Math.random() * 100)),
                    companyAddresses[random]
            );
            persons[i] = person;
        }
    }

    private static Person create(String name, int age) {
        Person person = new Person();

        person.name = name;
        person.age = age;
        return person;
    }
}