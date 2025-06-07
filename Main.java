public class Main {
    public static void main(String[] args) {
        // Create a new task
        Task task = new Task("Complete Java assignment1");
        Task task2 = new Task("Complete Java assignment2", "Finish the task by next week");
        // Mark the task as completed
        task.markAsCompleted();
        System.out.println("Task1 completed: " + task.isCompleted()+ task.getCreateTime());
        task2.setTags("tag1");
        task2.setTags("tag2");

        System.out.println("Task2 completed: " + task2.getDescription()+ task2.getCreateTime() + task2.getTags());
        TaskList taskList = new TaskList();
        taskList.addTask(task);
        taskList.addTask(task2);
        System.out.println(taskList.toString() + " tasks in the list.");
    }
}