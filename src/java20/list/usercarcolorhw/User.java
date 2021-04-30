package java20.list.usercarcolorhw;

import java.util.List;

public class User {

    private final String username;
    private final String name;

    private List<Car> carList;

    public User(String username, String name, List<Car> carList) {
        this.username = username;
        this.name = name;
        this.carList = carList;
    }

    public User(String username, String name) {
        this(username, name, List.of()) ;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", carList=" + carList +
                '}';
    }
}
