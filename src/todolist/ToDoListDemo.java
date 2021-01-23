package todolist;

import java.time.LocalDate;

import static todolist.API.getTasksByDueDate;
import static todolist.API.getTasksByEngineer;
import static todolist.API.getTasksByPriority;



public class ToDoListDemo {

    public static void main(String[] args) {
        API.arrayPrint(getTasksByPriority(AllTasks.get(), Priority.LOW));

        API.arrayPrint(getTasksByDueDate(AllTasks.get(), LocalDate.of(2021, 11, 28)));

        API.arrayPrint(getTasksByEngineer(AllTasks.get(), AllEngineers.get()[1]));
    }}
