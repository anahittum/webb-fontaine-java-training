package java20.list.usercarcolorhw;

import java.util.*;

public class UserCarColorTest {

    private static User user1 = new User("username1", "name1", List.of(new Car("VIN1", "Red"), new Car("VIN2", "Blue")));
    private static User user2 = new User("username2", "name2", List.of(new Car("VIN2", "Blue")));
    private static User user3 = new User("username3", "name3");

    private static List<User> userList = List.of(user1, user2, user3);

    public static void main(String[] args) {

        Optional<String> result = getNameByUsernameAndColor(userList, "username1", "Blue");
        result.ifPresentOrElse(System.out::println, () -> System.out.println("no result"));

        System.out.println(result.map(s -> s + "-user").orElse("Default user"));

        Optional<String> noResult = getNameByUsernameAndColor(userList, "user10", "Blue");
        noResult.ifPresentOrElse(System.out::println, () -> System.out.println("no result"));
        noResult.ifPresent(System.out::println);

        System.out.println(noResult.map(s -> s + "-user").orElse("Default user"));

        if (noResult.isPresent()) {
            System.out.println(noResult.get());
        } else {
            System.out.println("no result");
        }
    }

    private static Optional<String> getNameByUsernameAndColor(List<User> userList, String userName, String color) {
        for (User returnedUser : userList) {
            if (returnedUser.getUsername().equals(userName) & hasCar(returnedUser.getCarList(), color)) {
                return Optional.of(returnedUser.getName());
            }
        }
        return Optional.empty();
    }

    private static List<Car> getCarsByColor(List<Car> cars, String color) {
        List<Car> carList = new ArrayList<>();

        for (Car nextCar : cars) {
            if (nextCar.getColor().equals(color)) {
                carList.add(nextCar);
            }
        }
        return carList;
    }

    private static boolean hasCar(List<Car> cars, String color) {
        return getCarsByColor(cars, color).size() != 0;
    }
}

