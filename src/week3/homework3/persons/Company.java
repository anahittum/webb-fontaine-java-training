package week3.homework3.persons;

public class Company {
    String name;
    Person CEO;
    private String address;

    Company(String name, Person CEO, String address) {
        this.name = name;
        this.CEO = CEO;
        this.CEO.company = this;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", CEO=" + CEO.name +
                ", address='" + address + '\'' +
                '}';
    }
}
