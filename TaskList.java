import java.util.ArrayList;
import java.util.List;
public class TaskList {
    private List<Task> tasks;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Task task : tasks) {
            sb.append(task.getTaskName()).append("\n");
        }
        return sb.toString();
    }
    public TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task findTaskByName(String name) {
        for (Task task : tasks) {
            if (task.getTaskName().equals(name)) {
                return task;
            }
        }
        return null;
    }
}