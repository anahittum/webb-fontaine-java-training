package todolist;

import java.time.LocalDate;

public class Task {
    private String name;
    private String description;
    private Priority priority;
    private LocalDate startDate;
    private LocalDate dueDate;
    private Engineer assignee;
    private String label;

    Task(String name, String description, Priority priority, LocalDate startDate,
         LocalDate dueDate, Engineer assignee, String label) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.assignee = assignee;
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Priority getPriority() {
        return priority;
    }

    LocalDate getDueDate() {
        return dueDate;
    }

    Engineer getAssignee() {
        return assignee;
    }

    public void setAssignee(Engineer assignee) {
        this.assignee = assignee;
    }


    @Override
    public String toString() {
        return String.format("Name: %s,Description: %s,Priority: %s,startDate: %s,dueDate: %s,engineer: %s,label: %s",
                name, description, priority, startDate.toString(), dueDate.toString(), assignee, label);
    }
}
