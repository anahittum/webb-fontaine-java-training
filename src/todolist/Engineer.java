package todolist;

public class Engineer {

    private String name;
    private Role role;

    Engineer(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public Engineer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("Name: %s,Role: %s", name, role);
    }
}
