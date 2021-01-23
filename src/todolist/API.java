package todolist;


import java.time.LocalDate;

class API {

    static Task[] getTasksByPriority(Task[] tasks, Priority priority) {

        Task[] priorityTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getPriority().equals(priority)) {
                priorityTasks[i] = tasks[i];
            }
        }
        return priorityTasks;
    }

    public static Task[] getTasksByDueDate(Task[] tasks, LocalDate dueDate) {
        Task[] dueDateTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getDueDate().compareTo(dueDate) <= 0) {
                dueDateTasks[i] = tasks[i];
            }
        }

        return dueDateTasks;
    }

    static Task[] getTasksByEngineer(Task[] tasks, Engineer engineer) {
        Task[] engineerTasks = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (engineer.equals(tasks[i].getAssignee())) {
                engineerTasks[i] = tasks[i];
            }
        }
        return removeNullObjects(engineerTasks);
    }


    private static Task[] removeNullObjects(Task[] objects) {
        int newLength = 0;
        for (Object o : objects) {
            if (o != null)
                newLength++;
        }
        Task[] objectsWithoutNull = new Task[newLength];
        int j = 0;
        for (Task object : objects) {
            if (object != null) {
                objectsWithoutNull[j++] = object;
            }
        }
        return objectsWithoutNull;
    }

    static void arrayPrint(Object[] array) {
        if (array != null)
            for (Object object : array) {
                System.out.println(object);
            }
    }
}
