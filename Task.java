import java.time.LocalDate;
import java.util.List;

import java.util.ArrayList;
public class Task {
    private String description;
    private LocalDate dueDate;
    private boolean completed;
    private String taskName;
    private String ID;
    private int priority;
    private String category;
    private List<String> tags;
    private LocalDate createdDate;

    public Task(String name) {
        this.taskName = name;
        this.createdDate = LocalDate.now();
        this.completed = false;
        this.tags = new ArrayList<String>();

    }
    public Task(String name, String description){
        this.taskName = name;
        this.description = description;
        this.createdDate = LocalDate.now();
        this.completed = false;
        this.tags = new ArrayList<String>();
    }
    public String getTaskName() {
        return taskName;
    }

    public String getCreateTime() {
        return createdDate.toString();
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDueDate() {
        return dueDate.toString();
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setTags(String tags) {
        this.tags.add(tags);
    }
    public List<String> getTags() {
        return tags;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }
}
