package week3.homework3.persons;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println("All the people in the company: ");
        System.out.println(Arrays.toString(DataProvider.persons));
        System.out.println("People working in the given company are: ");
        System.out.println(Arrays.toString(API.getPersonsInSameCompany(DataProvider.persons, "Comp1")));
        System.out.println("The oldest person(s): ");
        System.out.println(Arrays.toString(API.getOldestPersons(DataProvider.persons)));
        System.out.println("The oldest person(s): ");
        System.out.println(Arrays.toString(API.getYoungestPersons(DataProvider.persons)));
        System.out.println("Persons sorted by name : ");
        System.out.println(Arrays.toString(API.getPersonsSortedByNames(DataProvider.persons)));
        System.out.println("Persons sorted by companies : ");
        System.out.println(Arrays.toString(API.getPersonsSortedByCompanies(DataProvider.persons)));
    }
}
