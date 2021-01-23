package todolist;

import java.time.LocalDate;


class AllTasks {
    private static Task[] tasks = new Task[5];

    static {
        tasks[0] = new Task("Task1", "Decsription", Priority.LOW,
                LocalDate.of(2021, 1, 11), LocalDate.of(2021, 2, 11), AllEngineers.get()[3], "NewProject");
        tasks[1] = new Task("Task2", "Decsription", Priority.MEDIUM, LocalDate.now(),
                LocalDate.of(2021, 2, 12), AllEngineers.get()[0], "NewProject");
        tasks[2] = new Task("Task3", "Decsription", Priority.HIGH, LocalDate.now(),
                LocalDate.of(2021, 3, 23), AllEngineers.get()[1], "NewProject");
        tasks[3] = new Task("Task4", "Decsription", Priority.LOW, LocalDate.now(),
                LocalDate.of(2021, 4, 25), AllEngineers.get()[2], "NewProject");
        tasks[4] = new Task("Task5", "Decsription", Priority.MEDIUM, LocalDate.now(),
                LocalDate.of(2021, 5, 29), AllEngineers.get()[3], "NewProject");
    }

    static Task[] get() {
        return tasks;
    }

    private AllTasks() {
    }
}
