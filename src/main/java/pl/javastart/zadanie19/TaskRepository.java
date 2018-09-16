package pl.javastart.zadanie19;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Repository
public class TaskRepository {
    private List<Task> tasks;

    public TaskRepository() {
        tasks = new ArrayList<>();
        tasks.add(new Task( "Mycie podłóg", 3, LocalDateTime.of(2018, 10, 7, 18, 0)));
        tasks.add(new Task( "Malowanie",  10, LocalDateTime.of(2018, 12, 1, 18, 0)));
        tasks.add(new Task( "Wyniesienie śmieci", 1, LocalDateTime.of(2018, 9, 9, 9, 0)));
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task findByDescription(String description){
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                return task;
            }
        }
        return null;
    }

    public List<Task> getAll() {
        return tasks;
    }
}
