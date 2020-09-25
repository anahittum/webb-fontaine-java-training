package week3.homework3.persons;

class API {


    static Person[] getPersonsInSameCompany(Person[] persons, String companyName) {
        Person[] personsCompany = new Person[getLength(persons, companyName)];
        int i = 0;
        for (Person person : persons) {
            if (person.company.name.equals(companyName)) {
                personsCompany[i] = person;
                i++;
            }
        }
        return personsCompany;
    }

    private static int getLength(Person[] persons, String companyName) {
        int length = 0;
        for (Person person : persons) {
            if (person.company.name.equals((companyName))) {
                length++;
            }
        }
        return length;
    }

    static Person[] getOldestPersons(Person[] persons) {
        int maxAge = getMaxAge(persons);

        Person[] oldestPersons = new Person[persons.length];

        int i = 0;
        for (Person person : persons) {
            if (person.age == maxAge) {
                oldestPersons[i++] = person;
            }
        }

        return oldestPersons;
    }

    private static int getMaxAge(Person[] persons) {
        int maxAge = persons[0].age;

        for (Person person : persons) {
            if (person.age > maxAge) {
                maxAge = person.age;
            }
        }

        return maxAge;
    }

    private static int getMinAge(Person[] persons) {
        int minAge = persons[0].age;

        for (Person person : persons) {
            if (person.age < minAge) {
                minAge = person.age;
            }
        }

        return minAge;
    }

    static Person[] getYoungestPersons(Person[] persons) {
        int minAge = getMinAge(persons);

        Person[] youngesttPersons = new Person[persons.length];

        int i = 0;
        for (Person person : persons) {
            if (person.age == minAge) {
                youngesttPersons[i++] = person;
            }
        }

        return youngesttPersons;
    }

    static Person[] getPersonsSortedByNames(Person[] persons) {
        Person temp;
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++)
                if (persons[i].name.compareTo(persons[j].name) > 0) {
                    temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
        }
        return persons;
    }

    static Person[] getPersonsSortedByCompanies(Person[] persons) {
        Person temp;
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].company.name.compareTo(persons[j].company.name) > 0) {
                    temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
        return persons;
    }
}
