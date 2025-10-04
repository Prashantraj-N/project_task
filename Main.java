import java.util.ArrayList;
import java.util.List;
class Task {
    private String name;
    private List<String> subtasks;
    private String tag;

    public Task(String name, List<String> subtasks) {
        this.name = name;
        this.subtasks = subtasks;
        this.tag = "normal"; 
    }
    public String getName() { return name; }
    public List<String> getSubtasks() { return subtasks; }
    public String getTag() { return tag; }
    public void setTag(String tag) { this.tag = tag; }
    public void display() {
        System.out.println("Task: " + name);
        System.out.println("Number of Subtasks: " + subtasks.size());
        System.out.println("Tag: " + tag);
    }
}

class TaskService {
    public void applyTag(Task task) {
        if (task.getSubtasks().size() > 5) {
            task.setTag("large");
        }
    }
}

public class TaskDemo {
    public static void main(String[] args) {

        // Sample subtasks
        List<String> subtasks = new ArrayList<>();
        subtasks.add("Design");
        subtasks.add("Coding");
        subtasks.add("Testing");
        subtasks.add("Deployment");
        subtasks.add("Review");
        subtasks.add("Documentation");

        Task task = new Task("Complete Project", subtasks);
        TaskService service = new TaskService();
        service.applyTag(task);
        task.display();
    }
}
