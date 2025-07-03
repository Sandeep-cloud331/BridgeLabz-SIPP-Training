class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskSchedulerNode {
    Task head = null;
    Task tail = null;
    Task current = null;

    // Add task at end
    void addTaskEnd(int id, String name, int priority, String date) {
        Task newTask = new Task(id, name, priority, date);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
            current = head;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }

    // Add task at beginning
    void addTaskBeginning(int id, String name, int priority, String date) {
        Task newTask = new Task(id, name, priority, date);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
            current = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    // Add task at specific position
    void addTaskAtPosition(int position, int id, String name, int priority, String date) {
        if (position == 0) {
            addTaskBeginning(id, name, priority, date);
            return;
        }

        Task newTask = new Task(id, name, priority, date);
        Task temp = head;
        int count = 0;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newTask.next = temp.next;
        temp.next = newTask;

        if (temp == tail) {
            tail = newTask;
        }
    }

    // Remove task by ID
    void removeTaskById(int id) {
        if (head == null) return;

        Task temp = head;
        Task prev = tail;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                    if (temp == tail) tail = prev;
                }
                System.out.println("Task with ID " + id + " removed.");
                if (current == temp) current = current.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task with ID " + id + " not found.");
    }

    // View current task and move to next
    void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Current Task -> ID: " + current.taskId + ", Name: " + current.taskName +
                ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
        current = current.next;
    }

    // Display all tasks
    void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        Task temp = head;
        System.out.println("Tasks in Scheduler:");
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by priority
    void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found -> ID: " + temp.taskId + ", Name: " + temp.taskName +
                        ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks with priority " + priority + " found.");
        }
    }
}
public class TaskScheduler {
    public static void main(String[] args) {
        TaskSchedulerNode scheduler = new TaskSchedulerNode();

        scheduler.addTaskEnd(1, "Math Homework", 2, "2025-07-05");
        scheduler.addTaskEnd(2, "Science Project", 1, "2025-07-07");
        scheduler.addTaskBeginning(3, "English Essay", 3, "2025-07-04");
        scheduler.addTaskAtPosition(1, 4, "History Notes", 2, "2025-07-06");

        scheduler.displayTasks();

        scheduler.viewCurrentTask(); // First task
        scheduler.viewCurrentTask(); // Next task

        scheduler.searchByPriority(2);
        scheduler.removeTaskById(2);
        scheduler.displayTasks();
    }
}

